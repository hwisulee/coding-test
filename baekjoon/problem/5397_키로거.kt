import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        var cur = 0
        val input = readLine()
        val result = LinkedList<Char>()

        for (c in input) {
            when (c) {
                '<' -> cur = if (cur > 0) cur - 1 else 0
                '>' -> cur = if (cur < result.size) cur + 1 else result.size
                '-' -> if (result.isNotEmpty() && cur > 0) result.removeAt(--cur)
                else -> result.add(cur++, c)
            }
        }

        bw.appendLine(result.joinToString(""))
    }
    bw.flush()
    bw.close()
}