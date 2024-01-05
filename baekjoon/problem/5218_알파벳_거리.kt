import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val (w1, w2) = readLine().split(" ")
        val arr = IntArray(w1.length) { 0 }
        for (i in w1.indices) {
            if (w2[i] >= w1[i]) arr[i] = w2[i] - w1[i] else arr[i] = w2[i] - w1[i] + 26
        }

        bw.write("Distances: ")
        arr.forEachIndexed { index, i -> bw.write("${arr[index]} ") }
        bw.appendLine()
    }
    bw.flush()
    bw.close()
}