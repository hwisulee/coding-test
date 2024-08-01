import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (k, l) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    readLine().forEach {
        val cur = it.code + (k % 26)
        if (it.isUpperCase()) {
            sb.append(if (cur > 90) (cur - 26).toChar() else cur.toChar())
        } else if (it.isLowerCase()) {
            sb.append(if (cur > 122) (cur - 26).toChar() else cur.toChar())
        } else {
            sb.append(it)
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}