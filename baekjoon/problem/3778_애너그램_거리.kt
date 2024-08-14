import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) { idx ->
        val a = IntArray(26)
        val b = IntArray(26)

        readLine().forEach {
            val cur = (it.code - 97)
            if (cur >= 0) a[cur]++
        }
        readLine().forEach {
            val cur = (it.code - 97)
            if (cur >= 0) b[cur]++
        }

        var result = 0
        for (i in a.indices) {
            if (a[i] != b[i]) {
                result += abs(a[i] - b[i])
            }
        }

        bw.write("Case #${idx + 1}: ${result}\n")
    }
    bw.flush()
    bw.close()
}