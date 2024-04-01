import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var idx = 1

    while (true) {
        val n = readLine().toInt()
        if (n == 0) break

        val scenario = MutableList<Pair<String, Int>>(n) { Pair(readLine(), 0) }
        repeat(n * 2 - 1) {
            val event = readLine().split(" ")
            val cur = scenario[event[0].toInt() - 1]
            scenario[event[0].toInt() - 1] = Pair(cur.first, cur.second + 1)
        }

        scenario.filter { it.second == 1 }.forEach {
            bw.appendLine("$idx ${it.first}")
            bw.flush()
        }
        idx++
    }
    
    bw.close()
}