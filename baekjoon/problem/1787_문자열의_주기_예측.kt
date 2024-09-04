import java.io.BufferedWriter
import java.io.OutputStreamWriter

const val MAX_VALUE = Long.MAX_VALUE

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()
    val pi = getPi(s)

    var result = 0L
    for (i in 0 until n) {
        result += pi[i]
    }

    val dp = LongArray(n) { -1 }
    var sum = 0L

    for (i in 0 until n) {
        val t = computeMinLength(i, pi, dp)
        if (t < MAX_VALUE) {
            sum += (i - t + 1)
        }
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}

fun getPi(s: String): IntArray {
    val length = s.length
    val lps = IntArray(length)
    var j = 0
    for(i in 1 until length) {
        while(j > 0 && s[i] != s[j]) j = lps[j - 1]
        if(s[i] == s[j]) lps[i] = ++j
    }
    return lps
}

fun computeMinLength(x: Int, pi: IntArray, dp: LongArray): Long {
    if (x < 0) return MAX_VALUE
    if (dp[x] != -1L) return dp[x]
    if (pi[x] == 0) return MAX_VALUE

    val result = minOf(pi[x].toLong(), computeMinLength(pi[x] - 1, pi, dp))
    dp[x] = result

    return result
}