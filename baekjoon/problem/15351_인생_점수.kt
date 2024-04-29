import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val score = readLine().replace(" ", "").sumOf { it - 'A' + 1 }
        bw.appendLine(if (score == 100) "PERFECT LIFE" else "$score")
        bw.flush()
    }

    bw.close()
}