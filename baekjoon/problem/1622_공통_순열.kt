import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    Looper@ while (true) {
        val a = IntArray(26)
        val b = IntArray(26)

        for (i in 0 until 2) {
            val input = readLine() ?: break@Looper
            input.forEach {
                if (i == 0) a[it.code - 97]++
                else b[it.code - 97]++
            }
        }

        val sb = StringBuilder()

        for (i in 0 until 26) {
            val char = (i + 97).toChar()
            val cnt = minOf(a[i], b[i])
            sb.append("$char".repeat(cnt))
        }

        bw.appendLine(sb.toString())
        bw.flush()
    }

    bw.close()
}