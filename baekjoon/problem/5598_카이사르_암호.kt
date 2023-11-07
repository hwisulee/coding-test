import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val input = readLine()
    repeat(input.length) {
        val code = input[it] - 3
        if (code < 65.toChar()) sb.append("${(code + 26)}") else sb.append("$code")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}