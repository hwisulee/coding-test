import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val treeMap = TreeMap<Long, Int>()

        repeat(readLine().toInt()) {
            val (c, n) = readLine().split(" ")
            when (c) {
                "I" -> {
                    treeMap[n.toLong()] = treeMap.getOrDefault(n.toLong(), 0) + 1
                }
                "D" -> {
                    if (treeMap.isNotEmpty()) {
                        val key = if (n == "1") treeMap.lastKey() else treeMap.firstKey()
                        if (treeMap[key] == 1) treeMap.remove(key) else treeMap[key] = treeMap[key]!! - 1
                    }
                }
            }
        }

        bw.appendLine(if (treeMap.isEmpty()) "EMPTY" else "${treeMap.lastKey()} ${treeMap.firstKey()}")
    }

    bw.flush()
    bw.close()
}