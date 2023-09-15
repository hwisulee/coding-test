import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var arr = arrayOf<Int>()
    repeat(n) { arr += readLine().toInt() }
    arr.sortDescending()

    var cnt = 1
    var max = arr[0]
    for (i in 1 until n) {
        cnt++

        if (arr[i] * cnt >= max) max = arr[i] * cnt
    }

    bw.write("$max")
    bw.flush()
    bw.close()
}