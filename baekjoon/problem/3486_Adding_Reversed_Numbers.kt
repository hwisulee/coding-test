import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        bw.appendLine("${readLine().split(" ").sumOf { it.reversed().toInt() }.toString().reversed().toInt()}")
    }
    bw.flush()
    bw.close()
}