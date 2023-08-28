import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())
    val arr = Array(n) { 0 }
    val dp = Array(n) { 1 }

    repeat(n) { arr[it] = st.nextToken().toInt() }

    for (i in 0 until n) {
        for (j in 0 until i) {
            if (arr[i] > arr[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
    }

    bw.write("${dp.max()}")
    bw.flush()
    bw.close()
}