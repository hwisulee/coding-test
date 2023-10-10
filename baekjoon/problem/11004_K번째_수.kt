import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = readLine().split(" ").map { it.toInt() }
    val arr = readLine().split(" ").map { it.toInt() }.sorted()
    bw.write("${arr.sorted()[k - 1]}")
    bw.flush()
    bw.close()
}