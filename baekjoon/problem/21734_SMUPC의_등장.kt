import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().forEach {
        val num = it.code.toString().chunked(1).sumOf { it.toInt() }
        bw.appendLine("$it".repeat(num))
        bw.flush()
    }
    bw.close()
}