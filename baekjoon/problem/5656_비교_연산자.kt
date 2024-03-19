import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    var idx = 0
    while (true) {
        idx++
        input = readLine()

        var result = "Case $idx: "
        input.split(" ").also {
            val a = it[0].toInt()
            val c = it[2].toInt()
            result += when (it[1]) {
                ">" -> if (a > c) "true" else "false"
                ">=" -> if (a >= c) "true" else "false"
                "<" -> if (a < c) "true" else "false"
                "<=" -> if (a <= c) "true" else "false"
                "==" -> if (a == c) "true" else "false"
                "!=" -> if (a != c) "true" else "false"
                else -> "break"
            }
        }

        if (result.contains("break")) break
        bw.appendLine(result)
        bw.flush()
    }
    bw.close()
}