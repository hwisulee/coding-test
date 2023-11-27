import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine().toBigDecimal()
    val x = readLine()
    val b = readLine().toBigDecimal()

    bw.write("${if (x == "+") a + b else a * b}")
    bw.flush()
    bw.close()
}