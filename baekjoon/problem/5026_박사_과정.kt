import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val n = readLine().toInt()
    repeat(n) {
        readLine().also {
            if (it == "P=NP") {
                sb.appendLine("skipped")
            } else {
                val (a, b) = it.split("+").map { it.toInt() }
                sb.appendLine("${a + b}")
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}