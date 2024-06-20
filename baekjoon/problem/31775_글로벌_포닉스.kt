import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(3) { readLine()[0] }.groupingBy { it }.eachCount()
    val cnt = arr.entries.map { it.key == 'l' || it.key == 'k' || it.key == 'p' }.count { it }
    bw.write(if (cnt == 3) "GLOBAL" else "PONIX")
    bw.flush()
    bw.close()
}