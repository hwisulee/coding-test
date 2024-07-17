import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val (a, n) = readLine().split(" ")
        val cur = a.toBigInteger().toString(n.toInt())
        bw.appendLine(if (cur == cur.reversed()) "1" else "0")
    }
    bw.flush()
    bw.close()
}