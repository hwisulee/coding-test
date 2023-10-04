import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    val sb = StringBuilder()
    val arr = mutableListOf<String>()
    repeat(s.length) {
        for (i in it until s.length) { sb.append(s[i]) }
        arr += sb.toString()
        sb.clear()
    }

    arr.sorted().forEach { bw.appendLine(it) }
    bw.flush()
    bw.close()
}