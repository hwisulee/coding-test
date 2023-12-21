import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, l) = readLine().split(" ").map { it.toInt() }
    val arr = readLine().split(" ").map { it.toInt() }.sorted()

    var cnt = 0
    var length = 0f
    arr.forEachIndexed { index, i ->
        if (index == 0) { length = i - 0.5f; cnt++; return@forEachIndexed }
        if ((length + l) < i) { length = i - 0.5f; cnt++ }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}