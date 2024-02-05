import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    var result = ""
    val sb = StringBuilder()
    for (i in 0 until n) {
        result += n.toString()
        if (result.length >= m) {
            result = result.substring(0, m)
            break
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}