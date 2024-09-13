import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()
    val t = readLine()

    var cnt = 0
    for (i in 0 until n) {
        if (s[i] != t[i]) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}