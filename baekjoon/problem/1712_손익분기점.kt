import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b, c) = readLine().split(" ").map { it.toInt() }
    bw.write(if (b < c) "${(a / (c - b)) + 1}" else "-1")
    bw.flush()
    bw.close()
}