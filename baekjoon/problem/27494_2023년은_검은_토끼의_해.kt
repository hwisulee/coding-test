import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    val pattern = arrayOf('2', '0', '2', '3')
    val n = (1 .. readLine().toInt()).map { it.toString() }
    for (i in n.indices) {
        val cur = n[i]
        if (cur.contains("2023")) {
            cnt++
            continue
        }

        var idx = 0
        for (j in cur.indices) {
            if (cur[j] == pattern[idx]) idx++
            if (idx == 4) {
                cnt++
                break
            }
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}