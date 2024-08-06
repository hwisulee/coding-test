import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = MutableList(readLine().toInt()) { readLine() }
    bw.write(list.filter { it.length == 3 }.sorted()[0])
    bw.flush()
    bw.close()
}