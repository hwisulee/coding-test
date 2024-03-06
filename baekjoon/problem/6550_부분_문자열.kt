import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        if (input.isNullOrEmpty()) break

        val (s, t) = input.split(" ")
        var idx = 0
        for (i in t.indices) {
            if (s[idx] == t[i]) idx++
            if (idx == s.length) break
        }

        bw.appendLine(if (idx == s.length) "Yes" else "No")
    }

    bw.flush()
    bw.close()
}