import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (x1, x2) = readLine().split(" ").map { it.toInt() }
    val arr = arrayListOf<Int>()

    for (i in 1 .. 100) {
        for (j in 1 .. i) arr.add(i)
    }

    var sum = 0
    for (i in x1 - 1 until x2) sum += arr[i]

    bw.write("$sum")
    bw.flush()
    bw.close()
}