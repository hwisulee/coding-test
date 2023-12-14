import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) { bw.appendLine("${readLine().split(" ").map { it.toInt() }.sortedDescending()[2]}") }
    bw.flush()
    bw.close()
}