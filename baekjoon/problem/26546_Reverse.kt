import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val (str, i, j) = readLine().split(" ")
        bw.appendLine(str.substring(0 until i.toInt()) + str.substring(j.toInt() .. str.lastIndex))
    }
    bw.flush()
    bw.close()
}
