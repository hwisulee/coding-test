import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val key = readLine()
    val password = readLine()

    val standard = key.mapIndexed { index, c -> Pair(c, index) }.sortedBy { it.first }
    val rows = password.length / key.length
    val columns = Array(key.length) { CharArray(rows) }

    var idx = 0
    for ((_, i) in standard) {
        for (r in 0 until rows) {
            columns[i][r] = password[idx++]
        }
    }

    val plainText = StringBuilder()
    for (r in 0 until rows) {
        for (c in key.indices) {
            plainText.append(columns[c][r])
        }
    }

    bw.write(plainText.toString())
    bw.flush()
    bw.close()
}