import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val dp = IntArray(1001)
    dp[1] = 1
    dp[2] = 3
    (3..n).forEach { dp[it] = (dp[it - 1] + 2 * dp[it - 2]) % 10007 }
    
    bw.write("${dp[n]}")
    bw.flush()
    bw.close()
}