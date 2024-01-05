import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${readLine().split(",").map { it.toInt() }.sum()}")
    bw.flush()
    bw.close()
}