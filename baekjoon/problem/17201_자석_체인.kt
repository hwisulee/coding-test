import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    bw.write(if (readLine().chunked(2).groupingBy { it }.eachCount().size == 1) "Yes" else "No")
    bw.flush()
    bw.close()
}