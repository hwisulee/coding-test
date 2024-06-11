import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var max = 0
    var save: Pair<Int, Int> = Pair(0, 0)
    val arr = Array(readLine().toInt()) { readLine() }.distinct()
    for (i in 0 until arr.lastIndex) {
        val cur = arr[i]

        for (j in i + 1 until arr.size) {
            val next = arr[j]
            var cnt = 0
            val length = cur.length.coerceAtMost(next.length)

            for (k in 0 until length) {
                if (cur[k] != next[k]) break
                cnt++
            }

            if (max < cnt) {
                max = cnt
                save = Pair(i, j)
            }
        }
    }

    save.apply {
        bw.appendLine(arr[first]).append(arr[second])
    }
    bw.flush()
    bw.close()
}