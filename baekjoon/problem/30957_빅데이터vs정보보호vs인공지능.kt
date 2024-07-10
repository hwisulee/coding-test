import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val group = readLine().chunked(1).groupingBy { it }.eachCount()
    group.filter { it.value >= group.maxOf { it.value } }.also {
        bw.write(
            when (it.size) {
                1 -> it.maxBy { it.value }.key
                2 -> it.keys.sortedWith(compareBy<String> { it == "A" }.thenBy { it == "S" }.thenBy { it == "B" }).joinToString("")
                else -> "SCU"
            }
        )
    }
    bw.flush()
    bw.close()
}