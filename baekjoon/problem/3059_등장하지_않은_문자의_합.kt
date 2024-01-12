import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    val max = (65 .. 90).sum()
    repeat(t) {
        val sum = readLine().toList().distinct().sumOf { it.code }
        bw.appendLine("${max - sum}")
    }
    bw.flush()
    bw.close()
}