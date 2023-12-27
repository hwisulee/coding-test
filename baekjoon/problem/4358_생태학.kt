import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var size = 0
    val map = TreeMap<String, Double>()
    while (true) {
        val input = readLine() ?: break
        map[input] = map.getOrDefault(input, 0.0) + 1
        size++
    }

    map.forEach { bw.appendLine("${it.key} ${String.format("%.4f", it.value / size * 100)}") }
    bw.flush()
    bw.close()
}