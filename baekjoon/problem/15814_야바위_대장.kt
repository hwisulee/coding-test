import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder(readLine())
    repeat(readLine().toInt()) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        sb[a] = sb[b].also { sb[b] = sb[a] }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}