import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cnt = IntArray(2) { 0 }
    readLine().also {
        for (i in 0 until it.length - 2) {
            if (it[i] == 'J' && it[i + 1] == 'O' && it[i + 2] == 'I') cnt[0]++
            if (it[i] == 'I' && it[i + 1] == 'O' && it[i + 2] == 'I') cnt[1]++
        }
    }

    cnt.forEach { bw.appendLine("$it") }
    bw.flush()
    bw.close()
}