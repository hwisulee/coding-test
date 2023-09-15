import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = readLine().split(" ").map { it.toInt() }.sortedDescending()

    bw.write("${arr[1]}")
    bw.flush()
    bw.close()
}