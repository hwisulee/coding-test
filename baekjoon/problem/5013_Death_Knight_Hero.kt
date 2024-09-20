import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    repeat(readLine().toInt()) {
        val cur = readLine()
        if (!cur.contains("CD")) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}