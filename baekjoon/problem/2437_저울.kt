import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val weight = readLine().split(" ").map { it.toInt() }.sorted()
    var last = 1
    weight.forEach {
        if (last < it) return@forEach
        last += it
    }

    bw.write("$last")
    bw.flush()
    bw.close()
}