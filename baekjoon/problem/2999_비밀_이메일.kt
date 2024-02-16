import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
    val rcArr = IntArray(2) { 0 }
    (1 .. input.length).forEach { r ->
        for (c in r .. input.length) {
            if (r * c == input.length) rcArr.also { it[0] = r; it[1] = c }
        }
    }

    val sb = StringBuilder()
    val passwordArr = input.chunked(rcArr[0])
    for (i in 0 until rcArr[0]) {
        for (j in 0 until rcArr[1]) {
            sb.append(passwordArr[j][i])
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}