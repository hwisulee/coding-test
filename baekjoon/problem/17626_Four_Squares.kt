import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val dp = IntArray(n + 1)
    dp[1] = 1

    var min = 0
    for (i in 2 .. n) {
        min = Integer.MAX_VALUE
        
        var j = 1
        while (j * j <= i) {
            val temp = i - j * j
            min = min.coerceAtMost(dp[temp])
            j++
        }

        dp[i] = min + 1
    }

    bw.write("${dp[n]}")
    bw.flush()
    bw.close()
}