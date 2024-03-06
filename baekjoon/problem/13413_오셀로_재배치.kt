import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val n = readLine().toInt()
        val before = readLine()
        val after = readLine()
        val difference = IntArray(2) { 0 }
        for (i in before.indices) {
            val a = before[i]
            val b = after[i]
            if (a != b) {
                if (a == 'W') difference[0]++ else difference[1]++
            }
        }

        bw.appendLine("${difference[0].coerceAtLeast(difference[1])}")
    }
    bw.flush()
    bw.close()
}