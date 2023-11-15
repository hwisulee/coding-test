import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.pow

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(System.`in`.bufferedReader()) {


    val n = readLine().toInt()
    bw.appendLine("${2.0.pow(n).toInt() - 1}")
    hanoi(n, 1, 3, 2)

    bw.flush()
    bw.close()
}

fun hanoi(n: Int, start: Int, end: Int, to: Int) {
    if (n == 1) bw.appendLine("$start $end")
    else {
        hanoi(n - 1, start, to, end)
        bw.appendLine("$start $end")
        hanoi(n - 1, to, end, start)
    }
}