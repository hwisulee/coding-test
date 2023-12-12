import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var idx = 1
    repeat(n) { bw.appendLine("${idx++}. ${readLine()}") }
    bw.flush()
    bw.close()
}