import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    readLine().split(" ").also {
        bw.write(if (it.map { it[0] }.groupingBy { it }.eachCount().size == 1) "1" else "0")
    }
    bw.flush()
    bw.close()
}