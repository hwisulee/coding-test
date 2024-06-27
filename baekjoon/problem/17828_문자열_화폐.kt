import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.system.exitProcess


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (n, x) = readLine().split(" ").map { it.toInt() }

    if (x < n || 26 * n < x) {
        bw.append("!").flush()
        exitProcess(0)
    }

    var index = n - 1
    val sb = StringBuilder("A".repeat(n))
    x -= n

    while (index >= 0 && x > 0) {
        val temp = minOf(x, 25)
        sb[index] = (temp + 65).toChar()
        x -= temp
        --index
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}