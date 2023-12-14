import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val line = readLine()
    var result = 0
    var cnt = 0
    var idx = 0
    while (idx < line.length) {
        when (line[idx]) {
            '(' -> if (line[idx + 1] == ')') { result += cnt; idx++ } else cnt++
            else -> { result++; cnt-- }
        }
        idx++
    }
    bw.write("$result")
    bw.flush()
    bw.close()
}