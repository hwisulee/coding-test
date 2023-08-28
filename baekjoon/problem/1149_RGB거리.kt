import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val dp = Array(n) { IntArray(3) { 0 } }
    repeat(n) {
        br.readLine().also { i ->
            val temp = i.split(" ").map { it.toInt() }
            for (j in 0 .. 2) { dp[it][j] = temp[j] }
        }
    }

    for (i in 1 until n) {
        dp[i][0] += minOf(dp[i - 1][1], dp[i - 1][2])
        dp[i][1] += minOf(dp[i - 1][0], dp[i - 1][2])
        dp[i][2] += minOf(dp[i - 1][0], dp[i - 1][1])
    }

    bw.write("${minOf(dp[n - 1][0], dp[n - 1][1], dp[n - 1][2])}")
    bw.flush()
    bw.close()
}