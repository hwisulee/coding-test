import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    repeat(readLine().toInt()) {
        val sb = StringBuilder()
        var (m, n, x, y) = readLine().split(" ").map { it.toInt() }
        x -= 1
        y -= 1

        var idx = x
        while (idx < (n * m)) {
            if (idx % n == y) {
                sb.append("${idx + 1}")
                break
            }
            idx += m
        }

        bw.appendLine(if (sb.isEmpty()) "-1" else sb.toString())
        bw.flush()
    }

    bw.close()
}