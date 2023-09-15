import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().chunked(10).forEach { bw.appendLine(it) }
    bw.flush()
    bw.close()
}