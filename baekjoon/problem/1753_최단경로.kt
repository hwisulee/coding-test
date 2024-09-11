import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

data class Edge(val to: Int, val weight: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (V, E) = readLine().split(" ").map { it.toInt() }
    val k = readLine().toInt()

    val graph = List(V + 1) { mutableListOf<Edge>() }

    repeat(E) {
        val (u, v, w) = readLine().split(" ").map { it.toInt() }
        graph[u].add(Edge(v, w))
    }

    bw.write(dijkstra(V, k, graph))
    bw.flush()
    bw.close()
}

fun dijkstra(V: Int, k: Int, graph: List<MutableList<Edge>>): String {
    val dist = IntArray(V + 1) { Int.MAX_VALUE }
    dist[k] = 0

    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.second })
    pq.offer(Pair(k, 0))

    while (pq.isNotEmpty()) {
        val (cur, curDist) = pq.poll()

        if (curDist > dist[cur]) continue

        for (edge in graph[cur]) {
            val next = edge.to
            val nextDist = curDist + edge.weight

            if (nextDist < dist[next]) {
                dist[next] = nextDist
                pq.offer(Pair(next, nextDist))
            }
        }
    }

    val sb = StringBuilder()
    for (i in 1 .. V) {
        sb.append(if (dist[i] == Int.MAX_VALUE) "INF" else "${dist[i]}").append("\n")
    }

    return sb.toString()
}