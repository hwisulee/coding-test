import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = readLine().split(" ")
    bw.write("${a.toCharArray().sumOf { it.digitToInt() }.toLong() * b.toCharArray().sumOf { it.digitToInt() }.toLong()}")
    bw.flush()
    bw.close()
}