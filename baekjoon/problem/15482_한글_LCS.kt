import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine()
    val m = readLine()
    val dp = Array(n.length + 1) { Array(m.length + 1) { 0 } }

    for (i in 1 .. n.length) {
        for (j in 1 .. m.length) {
            if (n[i - 1] == m[j - 1]) dp[i][j] = dp[i - 1][j - 1] + 1
            else dp[i][j] = max(dp[i - 1][j], dp[i][j - 1])
        }
    }

    bw.write("${dp[n.length][m.length]}")
    bw.flush()
    bw.close()
}