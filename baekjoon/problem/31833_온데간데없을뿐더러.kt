import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine()
    val a = readLine().split(" ").joinToString("").toLong()
    val b = readLine().split(" ").joinToString("").toLong()

    bw.write(if (a < b) "$a" else "$b")
    bw.flush()
    bw.close()
}