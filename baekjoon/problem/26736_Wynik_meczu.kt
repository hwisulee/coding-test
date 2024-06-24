import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().groupingBy { it }.eachCount().also {
        bw.write("${it.getOrDefault('A', 0)} : ${it.getOrDefault('B', 0)}")
    }
    bw.flush()
    bw.close()
}