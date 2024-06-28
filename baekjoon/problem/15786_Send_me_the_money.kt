import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val s = readLine()
    repeat(m) {
        var idx = 0
        val input = readLine()
        for (i in input.indices) {
            if (idx >= s.length) break
            if (input[i] == s[idx]) idx++
        }

        bw.appendLine(if (idx >= s.length) "true" else "false")
    }

    bw.flush()
    bw.close()
}