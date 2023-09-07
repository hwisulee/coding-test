import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val m = readLine().toInt()
    val n = readLine().toInt()
    val arr = (m .. n).map { if (sqrt(it.toDouble()).toInt() * sqrt(it.toDouble()).toInt() == it) it else 0 }.filter { it != 0 }

    if (arr.isEmpty()) bw.write("-1") else bw.appendLine("${arr.sumOf { it }}").appendLine("${arr.minOf { it }}")
    bw.flush()
    bw.close()
}