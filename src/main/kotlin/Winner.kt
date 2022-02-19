import java.util.Scanner

fun main() {
    val read = Scanner(System.`in`)
    val inputSize = read.nextLine().toInt()
    val gameSteps = mutableMapOf<Int, Pair<String, Int>>()
    val players = mutableMapOf<String, Int>()

    for (i in 0 until inputSize) {
        val input = read.nextLine()

        val pair = input.split(" ")
        val playerName = pair[0]
        val playerScore = pair[1].toInt()

        if (players.isEmpty() || !players.keys.contains(playerName)) {
            players[playerName] = playerScore
        } else {
            players[playerName] = players[playerName]!! + playerScore
        }
        gameSteps[i] = playerName to players[playerName]!!
    }

    val max = players.values.maxOrNull()

    for (step in gameSteps) {
        if (players[step.value.first]!! == max && step.value.second >= max) {
            println(step.value.first)
            break
        }
    }
}
