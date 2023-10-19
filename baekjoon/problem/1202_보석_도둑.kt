import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

data class Jewel(val weight: Int, val value: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = readLine().split(" ").map { it.toInt() }
    val jewelList = ArrayList<Jewel>()
    val backpack = ArrayList<Int>()
    val pq = PriorityQueue(Comparator.reverseOrder<Int>())
    var sum: Long = 0
    var pos = 0
    repeat(n) {
        val (m, v) = readLine().split(" ").map { it.toInt() }
        jewelList += Jewel(m, v)
    }
    repeat(k) { backpack += readLine().toInt() }

    jewelList.sortWith { j1, j2 -> if (j1.weight == j2.weight) j2.value - j1.value else j1.weight - j2.weight }
    backpack.sort()

    for (it in backpack) {
        for (i in pos until jewelList.size) {
            if (jewelList[i].weight <= it) { pq.offer(jewelList[i].value); pos = i + 1 } else break
        }

        if (!pq.isEmpty()) sum += pq.poll()
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}