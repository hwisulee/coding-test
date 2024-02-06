import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = readLine().split(" ").map { it.toInt() }
    val a = readLine().split(",").map { it.toInt() }
    var b = mutableListOf<Int>()
    repeat(k) {
        if (it == 0) {
            for (i in 0 until a.lastIndex) {
                b += a[i + 1] - a[i]
            }
        } else {
            val temp = mutableListOf<Int>()
            for (i in 0 until b.lastIndex) {
                temp += b[i + 1] - b[i]
            }
            b = temp
        }
    }

    bw.write(if (k == 0) a.joinToString(",") else b.joinToString(","))
    bw.flush()
    bw.close()
}