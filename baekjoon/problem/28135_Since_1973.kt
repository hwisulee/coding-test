import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val cnt = (1 until n).count { it.toString().contains("50") }

    bw.write("${n + cnt}")
    bw.flush()
    bw.close()
}