import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, c) = readLine().split(" ").map { it.toInt() }
    val arr = Array(n) { readLine().toLong() }
    arr.sort()

    var start = 1L
    var end = arr[n - 1] - arr[0]
    var max = 0L

    while (start <= end) {
        val mid = (start + end) / 2
        var cnt = 1
        var prev = arr[0]

        for (i in 1 until n) {
            if (arr[i] - prev >= mid) { cnt++; prev = arr[i] }
        }

        if (cnt >= c) { start = mid + 1; max = max(max, mid) } else end = mid - 1
    }

    bw.write("$max")
    bw.flush()
    bw.close()
}