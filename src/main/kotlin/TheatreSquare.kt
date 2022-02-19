import java.util.Scanner

/**
 * A. Theatre Square
 *
 * time limit per test: 1 second
 *
 * memory limit per test : 256 megabytes
 *
 * input : standard input
 *
 * output : standard output
 *
 * Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.
 *
 * What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.
 *
 * Input :
 *
 * The input contains three positive integer numbers in the first line: n, m and a (1 ≤ n, m, a ≤ 109).
 *
 * Examples : 6 6 4
 *
 * Output :
 *
 * Write the needed number of flagstones.
 *
 * Examples : 4
 **/

fun main() {
    val read = Scanner(System.`in`)
    val n = read.nextLong()
    val m = read.nextLong()
    val a = read.nextLong()
    val x = if ((n.toDouble() / a) % 1.0 != 0.0) {
        (n / a) + 1
    } else {
        (n / a)
    }
    val y = if ((m.toDouble() / a) % 1.0 != 0.0) {
        (m / a) + 1
    } else {
        (m / a)
    }

    println(x*y)
}