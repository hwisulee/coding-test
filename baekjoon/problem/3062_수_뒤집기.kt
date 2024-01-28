import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val input = readLine().toInt()
        val sum = (input + input.toString().reversed().toInt()).toString()
        bw.appendLine(if (sum == sum.reversed()) "YES" else "NO")
    }
    bw.flush()
    bw.close()
}