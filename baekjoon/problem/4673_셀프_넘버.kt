import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = BooleanArray(10001)
    for (i in 1 .. 10000) {
        val num = d(i)
        if (num <= 10000) arr[num] = true
    }

    val sb = StringBuilder()
    for (i in 1 .. 10000) { if (!arr[i]) sb.appendLine("$i") }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun d(n: Int): Int {
    var sum = n
    var num = n

    while (num != 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}