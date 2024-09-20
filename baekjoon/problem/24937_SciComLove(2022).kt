import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = "SciComLove"
    val n = (readLine().toInt()).let { if (it >= str.length) abs(it % str.length) else it }

    bw.write("${str.substring(n)}${str.substring(0 until n)}")
    bw.flush()
    bw.close()
}