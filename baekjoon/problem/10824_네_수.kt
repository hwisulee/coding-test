import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b, c, d) = readLine().split(" ")
    bw.write("${"$a$b".toLong() + "$c$d".toLong()}")
    bw.flush()
    bw.close()
}