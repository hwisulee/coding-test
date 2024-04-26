import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        val sb = StringBuilder()
        if (input.isNullOrEmpty()) break

        for (i in input) {
            val cur = Pair(i.lowercaseChar(), if (i.isLowerCase()) 0 else 1)
            when (cur.first) {
                'i' -> sb.append(if (cur.second > 0) "E" else "e")
                'e' -> sb.append(if (cur.second > 0) "I" else "i")
                else -> sb.append(i)
            }
        }

        bw.appendLine(sb.toString())
    }
    bw.flush()
    bw.close()
}