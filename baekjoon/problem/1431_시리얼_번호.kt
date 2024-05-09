import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = MutableList<String>(readLine().toInt()) { readLine() }
    list.sortWith(compareBy ({ it.length }, { it.filter { c -> c.isDigit() }.sumOf { num -> num.digitToInt() } }, { it }))

    bw.write(list.joinToString("\n"))
    bw.flush()
    bw.close()
}