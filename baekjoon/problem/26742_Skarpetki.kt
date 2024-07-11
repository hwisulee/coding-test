import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    bw.write("${readLine().chunked(1).groupingBy { it }.eachCount().mapValues { it.value / 2 }.values.sum()}")
    bw.flush()
    bw.close()
}