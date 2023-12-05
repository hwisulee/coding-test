import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    var t = readLine()
    while (true) {
        if (s.length == t.length || t.length == 1) break

        val cur = t.length - 1
        if (t[cur] == 'A') t = t.substring(0, cur)
        else if (t[cur] == 'B') t = t.substring(0, cur).reversed()
    }

    bw.write("${if (s == t) 1 else 0}")
    bw.flush()
    bw.close()
}