import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (k, n) = br.readLine().split(" ").map { it.toInt() }
    val arr = LongArray(k) { br.readLine().toLong() }

    var min = 0L
    var max = arr.maxOrNull()!! + 1

    while (min + 1 < max) {
        var cnt = 0L
        val mid = (max + min) / 2

        for (i in arr) cnt += i / mid

        if (cnt >= n) min = mid
        else max = mid
    }

    bw.write("$min")
    bw.flush()
    bw.close()
}