import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val map: MutableMap<String, Int> = mutableMapOf()
    readLine().split(" ").forEach {
        map[it] = 0
    }

    repeat(n) {
        readLine().split(" ").forEach {
            map[it] = map[it]!! + 1
        }
    }

    map.toList().sortedByDescending { it.second }.forEach {
        bw.appendLine("${it.first} ${it.second}")
    }
    bw.flush()
    bw.close()
}