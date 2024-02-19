import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) { i ->
        bw.appendLine("String #${i + 1}")
        readLine().forEach {
            val next = it + 1
            bw.write(if (next > 'Z') "${(next - 26)}" else "$next")
        }
        if (i != n - 1) bw.write("\n\n")
    }
    bw.flush()
    bw.close()
}