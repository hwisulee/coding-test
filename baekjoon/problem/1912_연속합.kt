import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }
    val dp = Array(n) { 0 }

    var max = arr[0]
    dp[0] = arr[0]

    for (i in 1 until n) {
        dp[i] = max(dp[i - 1] + arr[i], arr[i])
        max = max(max, dp[i])
    }

    bw.write("$max")
    bw.flush()
    bw.close()
}