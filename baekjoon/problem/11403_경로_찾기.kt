import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val dp = Array(n) { intArrayOf() }
    repeat(n) {
        dp[it] = readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    floydMarshall(n, dp)
    dp.forEach {
        bw.appendLine(it.joinToString(" "))
        bw.flush()
    }

    bw.close()
}

fun floydMarshall(n: Int, dp: Array<IntArray>) {
    for (k in 0 until n) {
        for (i in 0 until n) {
            for (j in 0 until n) {
                if (dp[i][k] == 1 && dp[k][j] == 1) dp[i][j] = 1
            }
        }
    }
}