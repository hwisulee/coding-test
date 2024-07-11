import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val h = readLine().toInt()
    if (h % 2 == 0) {
        sb.append("8".repeat(h / 2))
        if (sb.isBlank()) sb.append("1")
    } else {
        val quotient = h / 2
        val remainder = h % 2
        if (quotient > 0) {
            bw.write("4${"0".repeat(remainder - 1)}${"8".repeat(quotient)}")
        } else {
            bw.write("0")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}