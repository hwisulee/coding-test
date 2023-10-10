import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().split(" ").map { it.toInt() }
    val arr = readLine().split(" ").map { it.toInt() }.toHashSet()
    val m = readLine().toInt()
    var cnt = 0

    for (i in arr) {
        if (arr.contains(m - i)) cnt++
    }

    bw.write("${cnt / 2}")
    bw.flush()
    bw.close()
}