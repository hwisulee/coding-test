import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        readLine().lowercase().also {
            bw.appendLine(if (it == it.reversed()) "Yes" else "No")
        }
        bw.flush()
    }
    bw.close()
}