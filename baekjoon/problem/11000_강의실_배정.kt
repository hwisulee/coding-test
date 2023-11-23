import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = ArrayList<Pair<Int, Int>>()
    val pq = PriorityQueue<Int>()
    repeat(n) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        arr += Pair(a, b)
    }

    arr.sortBy { it.first }
    repeat(n) {
        pq += if (it == 0) arr[it].second
        else {
            if (pq.peek() <= arr[it].first) {
                pq.poll()
                arr[it].second
            } else {
                arr[it].second
            }
        }
    }

    bw.write("${pq.size}")
    bw.flush()
    bw.close()
}