import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = IntArray(2) { 0 }
    val sb = StringBuilder(readLine()).also {
        it.toString().also {
            arr[0] = it.count { it == '0' } / 2
            arr[1] = it.count { it == '1' } / 2
        }
    }

    for (i in sb.indices) {
        if (arr[1] != 0 && sb[i] == '1') {
            sb.setCharAt(i, '9')
            arr[1]--
        }
        if (arr[1] == 0) break
    }

    for (i in sb.length - 1 downTo 0) {
        if (arr[0] != 0 && sb[i] == '0') {
            sb.setCharAt(i, '9')
            arr[0]--
        }
        if (arr[0] == 0) break
    }

    bw.write(sb.filterNot { it == '9' }.toString())
    bw.flush()
    bw.close()
}