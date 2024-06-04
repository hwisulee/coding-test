import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 1
    val s = readLine().map { it.code }
    for (i in 1 until s.size) {
        if (s[i] <= s[i - 1]) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}