import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Player(val num: Int, val score: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var group: Array<Player> = arrayOf()
    repeat(5) { i ->
        val score = readLine().split(" ").sumOf { it.toInt() }
        group += Player(i + 1, score)
    }

    val winner = group.sortedByDescending { it.score }[0]
    bw.write("${winner.num} ${winner.score}")
    bw.flush()
    bw.close()
}