import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val sb = StringBuilder()
        val (a, b) = readLine().split(" ").map { it.toInt() }
        readLine().forEach {
            sb.append(((a * (it.code - 65) + b) % 26 + 65).toChar())
        }

        if (it < t) bw.appendLine(sb.toString()) else bw.append(sb.toString())
        bw.flush()
    }
    bw.close()
}