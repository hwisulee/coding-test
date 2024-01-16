import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (num1, num2) = readLine().split(":").map { it.toInt() }
    val temp = gcd(num1, num2)
    bw.write("${num1 / temp}:${num2 / temp}")
    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a