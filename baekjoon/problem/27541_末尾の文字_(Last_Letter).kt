import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()

    bw.write(if (s.last() == 'G') s.removeSuffix("G") else "${s}G")
    bw.flush()
    bw.close()
}