import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        if (it < n - 1) bw.appendLine(readLine().lowercase()) else bw.append(readLine().lowercase())
    }
    bw.flush()
    bw.close()
}