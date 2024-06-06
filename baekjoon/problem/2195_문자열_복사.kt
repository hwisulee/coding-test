import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    val p = readLine()

    var idx = 0
    var cnt = 1
    for (i in p.indices) {
        if (s.indexOf(p.substring(idx, i + 1)) != -1) continue
        idx = i
        cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}