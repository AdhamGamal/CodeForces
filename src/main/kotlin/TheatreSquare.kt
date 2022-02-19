import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)

    val theatreWidth = read.nextLong()
    val theatreHeight = read.nextLong()
    val flagstoneLength = read.nextLong()

    val widthFractions = theatreWidth % flagstoneLength
    val heightFractions = theatreHeight % flagstoneLength

    val numOfFlagstonesNeededToFillWidth = if (widthFractions > 0) {
        (theatreWidth / flagstoneLength) + 1
    } else {
        (theatreWidth / flagstoneLength)
    }

    val numOfFlagstonesNeededToFillHeight = if (heightFractions > 0) {
        (theatreHeight / flagstoneLength) + 1
    } else {
        (theatreHeight / flagstoneLength)
    }

    val totalNumberOfFlagstones = numOfFlagstonesNeededToFillWidth * numOfFlagstonesNeededToFillHeight

    println(totalNumberOfFlagstones)
}