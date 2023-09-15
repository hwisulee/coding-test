import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val a = readLine().split(" ").map { it.toInt() }.sorted()
    val b = readLine().split(" ").map { it.toInt() }.sorted()
    var sum = 0
    for (i in 0 until n) {
        sum += a[i] * b[n - 1 - i]
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}