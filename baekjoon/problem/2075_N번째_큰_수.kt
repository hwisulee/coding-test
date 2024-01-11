import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val pq = PriorityQueue<Int> { o1, o2 -> o2.compareTo(o1) }
    repeat(n) {
        val st = StringTokenizer(readLine())
        repeat(n) { pq.add(st.nextToken().toInt()) }
    }
    repeat(n - 1) { pq.poll() }
    
    bw.write("${pq.poll()}")
    bw.flush()
    bw.close()
}