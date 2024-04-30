import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = readLine().toInt()
    bw.write(readLine().chunked(k).map { it[0] }.joinToString(""))
    bw.flush()
    bw.close()
}