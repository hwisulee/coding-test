import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val arr = IntArray(26) { 0 }
        readLine().forEach {
            val cur = it.lowercaseChar() - 'a'
            if (cur in 0 .. 25) {
                arr[cur]++
            }
        }

        val sb = StringBuilder()
        for (i in arr.indices) {
            if (arr[i] == 0) sb.append('a' + i)
        }

        bw.write(if (sb.isEmpty()) "pangram" else "missing $sb")
        if (it < n) bw.append("\n")
    }
    bw.flush()
    bw.close()
}