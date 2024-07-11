import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val a = readLine()
    val b = readLine()

    var cnt = 0
    for (i in 0 until n) {
        if (a[i] != b[i]) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}