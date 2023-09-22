import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (x, y) = readLine().split(" ")
    bw.write("${rev(x, y)}")
    bw.flush()
    bw.close()
}

fun rev(x: String, y: String): Int = (x.reversed().toInt() + y.reversed().toInt()).toString().reversed().toInt()