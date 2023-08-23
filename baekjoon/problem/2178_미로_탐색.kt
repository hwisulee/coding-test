import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

data class Node(val x: Int, val y: Int)
var result = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n) { Array(m) { 0 } }
    repeat(n) { i ->
        br.readLine().also {
            for (j in it.indices) { if (it[j].digitToInt() == 1) map[i][j] = 1 }
        }
    }

    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)
    val visited = Array(n) { Array(m) { 1 } }
    bfs(n, m, dx, dy, visited, map)

    bw.write("$result")
    bw.flush()
    bw.close()
}

fun bfs(n: Int, m: Int, dx: IntArray, dy: IntArray, visited: Array<Array<Int>>, map: Array<Array<Int>>) {
    val queue: Queue<Node> = LinkedList()
    queue.offer(Node(0, 0))
    visited[0][0] = 1

    while (queue.isNotEmpty()) {
        val current = queue.poll()

        for (i in 0 until 4) {
            val nx = current.x + dx[i]
            val ny = current.y + dy[i]

            if (nx !in 0 until n || ny !in 0 until m || map[nx][ny] == 0 || visited[nx][ny] != 1) continue
            queue.offer(Node(nx, ny))
            visited[nx][ny] = visited[current.x][current.y] + 1

            if (nx == n - 1 && ny == m - 1) { result = visited[nx][ny]; break; }
        }
    }
}