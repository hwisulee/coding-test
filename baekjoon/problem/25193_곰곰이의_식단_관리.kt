import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val cnt = readLine().count { it == 'C' }
    bw.write("${cnt / (n - cnt + 1) + (if (cnt % (n - cnt + 1) !== 0) 1 else 0)}")
    bw.flush()
    bw.close()
}