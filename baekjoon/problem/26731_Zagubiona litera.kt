import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val max = ('A'..'Z').sumOf { it.code }
    val s = readLine().map { it.code }.sum()
    bw.write("${(max - s).toChar()}")
    bw.flush()
    bw.close()
}