import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var max = 0
    repeat(readLine().toInt()) {
        val cur = readLine().replace("for", "1").replace("while", "1").count { it == '1' }
        max = max.coerceAtLeast(cur)
    }

    bw.write("$max")
    bw.flush()
    bw.close()
}
