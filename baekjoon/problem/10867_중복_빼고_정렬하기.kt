import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val st = StringTokenizer(readLine())
    val set = mutableSetOf<Int>()
    repeat(n) {
        val num = st.nextToken().toInt()
        if (!set.contains(num)) set += num
    }

    bw.write(set.sorted().joinToString(" "))
    bw.flush()
    bw.close()
}