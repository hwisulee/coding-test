import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.system.exitProcess

data class Edge(val from: Int, val to: Int, val weight: Int): Comparable<Edge> {
    override fun compareTo(other: Edge): Int = this.weight - other.weight
}

lateinit var arr: Array<Int>

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    arr = Array(n + 1) { it }

    val map = Array(n) {
        val line = readLine()
        Array(n) {
            when {
                line[it].isDigit() -> 0
                line[it].isLowerCase() -> line[it] - 'a' + 1
                else -> line[it] - 'A' + 27
            }
        }
    }

    val pq = PriorityQueue<Edge>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (map[i][j] > 0) pq.offer(Edge(i, j, map[i][j]))
        }
    }

    var total = map.sumOf { it.sum() }
    while (pq.isNotEmpty()) {
        val target = pq.poll()
        if (union(target.to, target.from)) total -= target.weight
    }

    val firstParent = find(0)
    for (i in 1 until n) {
        if (firstParent != find(i)) {
            bw.write("-1")
            bw.flush()
            exitProcess(0)
        }
    }

    bw.write("$total")
    bw.flush()
    bw.close()
}

fun find(x: Int): Int = if (x == arr[x]) x else { arr[x] = find(arr[x]); arr[x] }

fun union(x: Int, y: Int): Boolean {
    val nx = find(x)
    val ny = find(y)

    return if (nx != ny) {
        arr[nx] = ny
        true
    } else {
        false
    }
}