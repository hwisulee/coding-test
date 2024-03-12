import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val input = readLine()
    bw.write(input.substring(input.lastIndex - 4 .. input.lastIndex))
    bw.flush()
    bw.close()
}