import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val maxPQ = PriorityQueue<Int>(compareByDescending { it })
    val minPQ = PriorityQueue<Int>()
    repeat(n) {
        val cur = readLine().toInt()

        if (maxPQ.size == minPQ.size) {
            minPQ.offer(cur)
            maxPQ.offer(minPQ.poll())
        } else {
            maxPQ.offer(cur)
            minPQ.offer(maxPQ.poll())
        }

        bw.appendLine("${maxPQ.peek()}")
    }
    bw.flush()
    bw.close()
}