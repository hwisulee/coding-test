import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val (s, p) = readLine().split(" ")
        bw.appendLine("${s.replace(p, "0").count()}")
        bw.flush()
    }
    bw.close()
}