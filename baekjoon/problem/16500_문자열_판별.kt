import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    val set = hashSetOf<String>()
    repeat(readLine().toInt()) {
        set.add(readLine())
    }

    val dp = IntArray(s.length)
    for (i in s.lastIndex downTo 0) {
        for (j in i + 1 .. s.lastIndex) {
            if (dp[j] == 1) if (set.contains(s.substring(i, j))) dp[i] = 1
        }

        if (set.contains(s.substring(i))) dp[i] = 1
    }

    bw.write("${dp[0]}")
    bw.flush()
    bw.close()
}