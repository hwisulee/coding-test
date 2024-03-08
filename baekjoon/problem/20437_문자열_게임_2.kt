import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val w = readLine()
        val k = readLine().toInt()
        val list = Array(26) { mutableListOf<Int>() }

        var minL = 10001
        var maxL = k - 1
        for (i in w.indices) {
            val cur = w[i] - 'a'
            list[cur].add(i)

            if (list[cur].size >= k) {
                val length = i - list[cur][list[cur].size - k] + 1
                minL = length.coerceAtMost(minL)
                maxL = length.coerceAtLeast(maxL)
            }
        }

        bw.appendLine(if (minL == 10001) "-1" else "$minL $maxL")
    }
    bw.flush()
    bw.close()
}