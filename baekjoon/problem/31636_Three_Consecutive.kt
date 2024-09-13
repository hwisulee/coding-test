import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()

    bw.write(if (s.contains("ooo")) "Yes" else "No")
    bw.flush()
    bw.close()
}