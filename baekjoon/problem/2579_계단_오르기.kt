import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val stair = IntArray(n) { br.readLine().toInt() }
    val dp = IntArray(n) { stair[0] }

    if (n >= 2) dp[1] = maxOf(stair[0] + stair[1], stair[1])
    if (n >= 3) dp[2] = maxOf(stair[0] + stair[2], stair[1] + stair[2])
    for (i in 3 until n) dp[i] = maxOf(stair[i] + dp[i - 2], stair[i] + stair[i - 1] + dp[i - 3])

    bw.write("${dp[n - 1]}")
    bw.flush()
    bw.close()
}