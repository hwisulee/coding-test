import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = readLine().toInt()
    when {
        num < 100 -> bw.write("$num")
        else -> {
            var cnt = 99
            (100 .. num).forEach {
                val cur = it.toString().chunked(1).map { it.toInt() }
                if (cur[0] - cur[1] == cur[1] - cur[2]) cnt++
            }

            bw.write("$cnt")
        }
    }
    bw.flush()
    bw.close()
}