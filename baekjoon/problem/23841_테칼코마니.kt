import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) {
        val sb = StringBuilder(readLine())

        for (i in 0 until m / 2) {
            if (sb[i] == '.' || sb[sb.lastIndex - i] == '.') {
                if (sb[i] == '.') sb[i] = sb[sb.lastIndex - i]
                if (sb[sb.lastIndex - i] == '.') sb[sb.lastIndex - i] = sb[i]
            }
        }

        sb.toString()
    }

    bw.write(map.joinToString("\n"))
    bw.flush()
    bw.close()
}