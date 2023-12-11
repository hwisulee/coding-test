import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) { bw.appendLine(if (readLine().last().digitToInt() % 2 == 0) "even" else "odd") }

    bw.flush()
    bw.close()
}