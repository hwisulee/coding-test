import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toLong() }
    val trees = br.readLine().split(" ").map { it.toLong() }.toMutableList()

    var min = 0L
    var max = trees.max()

    while (min <= max) {
        var result = 0L
        val mid = (min + max) / 2
        trees.forEach { if (it > mid) result += it - mid }

        if (result >= m) { min = mid + 1}
        else { max = mid - 1}
    }

    bw.write("$max")
    bw.flush()
    bw.close()
}