import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val sb = StringBuilder()
    repeat(n) {
        val input = readLine().split(" ").toMutableList().also { it[0] = "god" }
        sb.appendLine(input.joinToString(""))
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}