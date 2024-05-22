import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n) {
        list += readLine().map { it }.sorted().joinToString("")
    }

    bw.write("${list.groupingBy { it }.eachCount().size}")
    bw.flush()
    bw.close()
}