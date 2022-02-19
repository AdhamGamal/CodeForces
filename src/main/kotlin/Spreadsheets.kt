import java.util.Scanner
import kotlin.math.pow

fun main() {
    val read = Scanner(System.`in`)
    val inputSize = read.nextLine().toInt()
    for (i in 0 until inputSize) {
        val input = read.nextLine()
        val pattern = Regex("R(\\d+)C(\\d+)")
        if (pattern.matches(input)) {
            println(case1(input))
        } else {
            println(case2(input))
        }
    }
}

fun case1(input: String): String {
    val columnCharIndex = input.indexOf('C')
    val rowNumber = input.substring(1, columnCharIndex)
    val columnNumber = input.substring(columnCharIndex + 1).toInt()
    return convertNumberToChars(columnNumber) + rowNumber
}

fun convertNumberToChars(numbers: Int): String {
    val start = 'A'.toInt()
    var limit = numbers
    val chars = StringBuilder()
    while (limit > 0) {
        val remaining = limit % 26
        if (remaining == 0) {
            chars.insert(0, 'Z')
            limit = (limit / 26) - 1
        } else {
            val char = start + (remaining - 1)
            chars.insert(0, char.toChar())
            limit /= 26
        }
    }

    return chars.toString()
}

fun case2(input: String): String {
    val numbers = StringBuilder()
    val chars = StringBuilder()
    for (i in input) {
        if (i.isDigit()) {
            numbers.append(i)
        } else {
            chars.append(i)
        }
    }

    return "R${numbers}C${convertCharsToNumbers(chars.toString())}"
}

fun convertCharsToNumbers(chars: String): Int {
    val start = 'A'.toInt()
    var numbers = 0
    val limit = chars.length
    for (i in 0 until limit) {
        numbers += (1 + chars[i].toInt() - start) * (26.0).pow(limit - (i + 1)).toInt()
    }

    return numbers
}