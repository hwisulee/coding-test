import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(3) {
        var cnt = 0
        var (t1, t2) = readLine().split(" ").map {
            val cur = it.split(":").map { it.toInt() }
            cur[0] * 3600 + cur[1] * 60 + cur[2]
        }

        while (true) {
            if (timeToInt(t1) % 3 == 0) cnt++
            if (t1 == t2) break
            t1++
            t1 %= (3600 * 24)
        }

        bw.appendLine("$cnt")
    }

    bw.flush()
    bw.close()
}

fun timeToInt(time: Int): Int {
    var cur = time
    val list = IntArray(3)

    for (i in 0 until 3) {
        list[i] = cur % 60
        cur /= 60
    }

    return list[2] * 10000 + list[1] * 100 + list[0]
}