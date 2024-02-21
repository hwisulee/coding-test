import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) { idx ->
        readLine().also {
            val mid = it.length / 2
            bw.write(if (it[mid - 1] == it[mid]) "Do-it" else "Do-it-Not")
            if (idx < n - 1) bw.appendLine()
        }
    }
    bw.flush()
    bw.close()
}
