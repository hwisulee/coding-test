import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val sb = StringBuilder(readLine())
        var last = sb.last()

        if (sb.endsWith("ne")) {
            sb.deleteRange(sb.lastIndex - 1, sb.length)
            last = 'n'
        } else {
            sb.deleteAt(sb.lastIndex)
        }

        val newLast = when (last) {
            'a' -> "as"
            'i', 'y' -> "ios"
            'l' -> "les"
            'n' -> "anes"
            'o' -> "os"
            'r' -> "res"
            't' -> "tas"
            'u' -> "us"
            'v' -> "ves"
            'w' -> "was"
            else -> "${last}us"
        }

        sb.append(newLast)
        bw.appendLine(sb.toString())
        bw.flush()
    }
    bw.close()
}