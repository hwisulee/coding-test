import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val str = readLine().replace("[^a-z]".toRegex(), "").groupingBy { it }.eachCount()
    bw.write("${str.maxOf { it.value }}")
    bw.flush()
    bw.close()
}