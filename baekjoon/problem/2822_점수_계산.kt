import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Data(val idx: Int, val score: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = arrayListOf<Data>()
    repeat(8) { arr += Data(it + 1, readLine().toInt()) }
    arr.sortedByDescending { it.score }.slice(0 .. 4).also {
        bw.appendLine("${it.sumOf { it.score }}")
        bw.append(it.map { it.idx }.sorted().joinToString(" "))
    }

    bw.flush()
    bw.close()
}