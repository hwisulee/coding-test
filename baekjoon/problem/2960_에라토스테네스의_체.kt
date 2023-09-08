import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = readLine().split(" ").map { it.toInt() }
    val check = BooleanArray(n + 1)

    var switch = false
    val arr = intArrayOf(0, 0)
    for (i in 2 .. n) {
        for (j in i .. n step i) {
            if (!check[j]) {
                arr[0]++
                check[j] = true
            }
            if (arr[0] == k && !switch) {
                arr[1] = j
                switch = true
            }
        }
    }

    bw.write("${arr[1]}")
    bw.flush()
    bw.close()
}