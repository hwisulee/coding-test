import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val list = listOf(Pair('E', 'I'), Pair('S', 'N'), Pair('T', 'F'), Pair('J', 'P'))
    readLine().forEachIndexed { idx, c ->
        if (c == list[idx].first) sb.append(list[idx].second) else sb.append(list[idx].first)
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}