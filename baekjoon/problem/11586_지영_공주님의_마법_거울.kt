import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = Array(n) { "" }
    repeat(n) { arr[it] = readLine() }

    val mind = readLine().toInt()
    when (mind) {
        1 -> arr.map { bw.appendLine(it) }
        2 -> arr.map { bw.appendLine(it.reversed()) }
        3 -> arr.reversed().map { bw.appendLine(it) }
    }

    bw.flush()
    bw.close()
}