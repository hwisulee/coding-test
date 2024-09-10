import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val list = MutableList(n) { readLine() }

    var cnt = 0
    for (i in list.indices) {
        for (j in 0 .. list[i].length - k) {
            if (list[i][j] == '0') {
                val cur = list[i].substring(j until j + k)
                if (!cur.contains('1')) cnt++
            }
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}