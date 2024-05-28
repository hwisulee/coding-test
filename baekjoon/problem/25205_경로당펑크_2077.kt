import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val mid = arrayOf('k', 'i', 'j', 'u', 'h', 'y', 'n', 'b', 'm', 'l', 'o', 'p')

    val n = readLine().toInt()
    val s = readLine()

    bw.write(if (s.last() !in mid) "1" else "0")
    bw.flush()
    bw.close()
}