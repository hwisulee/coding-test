import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = readLine().toInt()
    val str = readLine()
    val sb = StringBuilder()
    for (i in 0 until k) {
        for (j in 0 until str.length / k) {
            sb.append(str[if (j % 2 == 0) j * k + i else j * k + k - 1 - i])
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}