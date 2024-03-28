import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    var (a, b) = readLine().split(" ")
    val gap = abs(a.length - b.length)
    if (a.length < b.length) {
        a = "0".repeat(gap) + a
    } else {
        b = "0".repeat(gap) + b
    }

    a.forEachIndexed { index, c ->
        sb.append(b[index].digitToInt() + c.digitToInt())
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}