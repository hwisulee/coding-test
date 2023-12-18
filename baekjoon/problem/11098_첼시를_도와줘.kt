import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Player (val cost: Int, val name: String)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val p = readLine().toInt()
        val player = arrayListOf<Player>()
        repeat(p) {
            val (cost, name) = readLine().split(" ")
            player += Player(cost.toInt(), name)
        }
        if (it < n - 1) bw.appendLine(player.maxBy { it.cost }.name) else bw.append(player.maxBy { it.cost }.name)
    }
    bw.flush()
    bw.close()
}