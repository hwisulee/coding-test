import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()

    bw.write(if (isVitaminString(n, s)) "YES" else "NO")
    bw.flush()
    bw.close()
}

fun isVitaminString(n: Int, s: String): Boolean {
    for (i in 1 until n) {
        val sub1 = s.substring(0, i)
        val sub2 = s.substring(n - i, n)

        var diffCount = 0
        for (j in 0 until i) {
            if (sub1[j] != sub2[j]) diffCount++
            if (diffCount > 1) break
        }
        
        if (diffCount == 1) return true
    }

    return false
}