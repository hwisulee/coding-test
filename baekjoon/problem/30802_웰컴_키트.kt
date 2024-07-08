import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val sizeCount = readLine().split(" ").map { it.toInt() }
    val (t, p) = readLine().split(" ").map { it.toInt() }
    val tCal = sizeCount.sumOf { if (it % t != 0) (it / t) + 1 else it / t }

    bw.appendLine("$tCal").appendLine("${n / p} ${n % p}")
    bw.flush()
    bw.close()
}