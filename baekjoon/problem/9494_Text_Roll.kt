import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var idx: Int
    var input: String
    while (true) {
        idx = 0
        input = readLine()
        if (input == "0") break
        try {
            repeat(input.toInt()) {
                val text = readLine()
                var temp = text.indexOf(' ', idx)
                if (temp == -1) temp = text.length
                idx = idx.coerceAtLeast(temp)
            }
        } catch (_: NumberFormatException) { }

        bw.appendLine("${idx + 1}")
    }
    bw.flush()
    bw.close()
}