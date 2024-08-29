import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val original = readLine()
    val reWritten = readLine()

    var cnt = 0
    for (i in original.indices) {
        if (reWritten[i] == original[i]) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}