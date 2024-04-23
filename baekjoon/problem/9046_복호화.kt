import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        readLine().replace(" ", "").groupingBy { it }.eachCount().also {
            val max = it.values.max()
            bw.appendLine(if (it.count { it.value >= max } > 1) "?" else "${it.maxBy { it.value }.key}")
        }
    }

    bw.flush()
    bw.close()
}