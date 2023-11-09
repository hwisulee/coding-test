import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var sum = 0
    val sb = StringBuilder()
    val n = readLine().chunked(1).map { it.toInt() }.sortedDescending()
    for (i in n.indices) {
        sum += n[i]
        sb.append(n[i])
    }

    if (n[n.lastIndex] != 0 || sum % 3 != 0) {
        sb.clear()
        sb.append("-1")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}