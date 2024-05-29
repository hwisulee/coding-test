import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, i) = readLine().split(" ").map { it.toInt() }
    val list = List<String>(n) { readLine() }.sorted()

    bw.write(list[i - 1])
    bw.flush()
    bw.close()
}