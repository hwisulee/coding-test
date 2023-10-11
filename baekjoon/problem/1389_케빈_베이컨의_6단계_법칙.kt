import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.min

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var st = StringTokenizer(readLine())
    val (n, m) = List(2) { st.nextToken().toInt() }
    val dp = Array(n + 1) { IntArray(n + 1) { 987654321 } }
    for (i in 0 until m) {
        st = StringTokenizer(readLine())
        val (a, b) = List(2) { st.nextToken().toInt() }
        dp[a][b] = 1
        dp[b][a] = 1
    }

    for (k in 1 .. n) {
        for (i in 1 .. n) {
            for (j in 1 .. n) {
                if (i == j) { dp[i][j] = 0; continue }
                dp[i][j] = min(dp[i][k] + dp[k][j], dp[i][j])
            }
        }
    }

    var sum = 987654321
    var ans = 0
    for (i in 1 .. n) {
        var cnt = 0
        for (j in 1 .. n) {
            if (i == j) continue
            cnt += dp[i][j]
        }

        if (sum > cnt) { sum = cnt; ans = i }
    }

    bw.write("$ans")
    bw.flush()
    bw.close()
}