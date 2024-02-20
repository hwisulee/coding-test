import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val (front, back) = readLine().split("-")
        bw.write(if (calculator(front, back) <= 100) "nice" else "not nice")
        if (it < n - 1) bw.appendLine()
    }
    bw.flush()
    bw.close()
}

fun calculator(front: String, back: String): Double {
    var num = 0.0
    for (i in 2 downTo 0) {
        num += (front[i].code - 65) * 26.toDouble().pow(2 - i)
    }
    return abs(num - back.toInt())
}