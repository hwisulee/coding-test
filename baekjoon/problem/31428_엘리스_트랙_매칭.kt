import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    bw.write("${readLine().split(" ").groupingBy { it }.eachCount().getOrDefault(readLine(), 0)}")
    bw.flush()
    bw.close()
}