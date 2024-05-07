import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c) = readLine().split(" ").map { it.toInt() }
    val record = mutableListOf<Pair<Char, Int>>()
    repeat(r) {
        val cur = readLine()
        for (i in cur.lastIndex - 1 downTo 1) {
            if (cur[i] != '.') {
                record += Pair(cur[i], i)
                break
            }
        }
    }

    val result = IntArray(9)
    record.groupBy { it.second }.entries.sortedByDescending { it.value[0].second }.forEachIndexed { index, entry ->
        with(entry.value) {
            if (size == 1) {
                result[entry.value[0].first.digitToInt() - 1] = index + 1
            } else {
                repeat(size) {
                    result[this[it].first.digitToInt() - 1] = index + 1
                }
            }
        }
    }

    result.map { bw.appendLine("$it") }
    bw.flush()
    bw.close()
}