import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val sb = StringBuilder()
    readLine().also {
        val index = it.indexOfFirst { it == '*' }
        sb.append(it).insert(index, ".")
    }
    val pattern = sb.toString().toRegex()
    repeat(n) {
        val input = readLine()
        bw.appendLine(if (pattern.matches(input)) "DA" else "NE")
    }
    bw.flush()
    bw.close()
}