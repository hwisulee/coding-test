import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    val group = Array(2) { Array(26) { 0 } }
    readLine().forEachIndexed { index, c ->
        val cur = c - 'A'
        if (group[0][cur] == 0) group[0][cur] = index + 1 else group[1][cur] = index + 1
    }

    for (i in group[0].indices) {
        for (j in group[1].indices) {
            if (group[0][i] < group[0][j] && group[0][j] < group[1][i] && group[1][i] < group[1][j]) cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}