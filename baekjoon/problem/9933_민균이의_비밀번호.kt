import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = ""
    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n) {
        list += readLine()
    }

    for (i in list.indices) {
        val cur = list[i]
        val reversed = list.map { it.reversed() }
        for (j in reversed.indices) {
            if (cur == reversed[j]) result = "${cur.length} ${cur[cur.length / 2]}"
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}