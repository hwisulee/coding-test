import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Report (val a: Int, val b: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val n = readLine().toInt()
        val list = mutableListOf<Report>()
        var result = 0
        var max = Int.MAX_VALUE

        repeat(n) {
            val (a, b) = readLine().split(" ").map { it.toInt() }
            list.add(Report(a, b))
        }

        list.sortBy { it.a }
        list.forEach { if (max > it.b) { max = it.b; result++ } }

        bw.appendLine("$result")
        list.clear()
    }

    bw.flush()
    bw.close()
}