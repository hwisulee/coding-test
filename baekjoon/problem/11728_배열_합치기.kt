import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    var st = StringTokenizer(readLine())
    val arr = IntArray(n + m)
    for (i in 0 until (n + m)) {
        arr[i] = st.nextToken().toInt()
        if (i + 1 == n) st = StringTokenizer(readLine())
    }
    arr.sort()
    for (i in 0 until (n + m)) {
        bw.write("${arr[i]} ")
    }
    bw.flush()
    bw.close()
}