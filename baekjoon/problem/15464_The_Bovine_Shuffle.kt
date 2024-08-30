import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

const val MAX_SIZE = 101

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val order = Array(4) { IntArray(MAX_SIZE) }
    val arr = IntArray(MAX_SIZE)

    var st = StringTokenizer(readLine())
    for (i in 1 .. n) { arr[i] = st.nextToken().toInt() }

    st = StringTokenizer(readLine())
    for (i in 1 .. n) { order[0][i] = st.nextToken().toInt() }

    for (i in 1 .. 3) {
        for (j in 1 .. n) {
            order[i][j] = order[i - 1][arr[j]]
        }
    }
    
    for (i in 1 .. n) {
        bw.write("${order[3][i]}\n")
    }

    bw.flush()
    bw.close()
}