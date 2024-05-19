import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val (input, output) = readLine().split(" ").map { it }
        bw.appendLine(if (input == output) "OK" else "ERROR")
    }
    bw.flush()
    bw.close()
}