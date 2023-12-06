import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val (err, str) = readLine().split(" ")
        bw.appendLine(str.removeRange(err.toInt() - 1 until  err.toInt()))
    }
    bw.flush()
    bw.close()
}