import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (m, n, k) = readLine().split(" ").map { it.toInt() }
    repeat(m) {
        val line = readLine()
        val mid = line.length / 2

        if (n % 2 == 0) {
            val left = line.slice(0 until mid).map { "$it".repeat(k) }.joinToString("")
            val right = line.slice(mid .. line.lastIndex).map { "$it".repeat(k) }.joinToString("")

            repeat(k) {
                bw.appendLine(left + right)
            }
        } else {
            val left = line.slice(0 until mid).map { "$it".repeat(k) }.joinToString("")
            val right = line.slice(mid + 1 .. line.lastIndex).map { "$it".repeat(k) }.joinToString("")
            repeat(k) {
                bw.appendLine(left + "${line[mid]}".repeat(k) + right)
            }
        }
    }

    bw.flush()
    bw.close()
}