import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val map = Array(n) { readLine() }
    val dic = mutableSetOf<String>()

    for (i in map.indices) {
        val sb = StringBuilder()

        for (j in map.indices) {
            if (!dic.contains(map[i])) dic += map[i]

            sb.append(map[j][i])
        }

        if (!dic.contains(sb.toString())) dic += sb.toString()
    }

    bw.write(if (dic.size == n) "YES" else "NO")
    bw.flush()
    bw.close()
}