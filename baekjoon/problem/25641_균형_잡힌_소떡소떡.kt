import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val cnt = IntArray(2)
    val sb = StringBuilder()
    readLine().forEach {
        when (it) {
            's' -> cnt[0]++
            't' -> cnt[1]++
        }

        sb.append(it)
    }

    while (cnt[0] != cnt[1]) {
        when (sb[0]) {
            's' -> cnt[0]--
            't' -> cnt[1]--
        }

        sb.deleteAt(0)
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}