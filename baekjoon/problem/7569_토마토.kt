import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

data class Node(val x: Int, val y: Int, val z: Int)

lateinit var box: Array<Array<IntArray>>
val dx = arrayOf(0, 0, 1, -1, 0, 0)
val dy = arrayOf(1, -1, 0, 0, 0, 0)
val dz = arrayOf(0, 0, 0, 0, 1, -1)
var day = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (m, n, h) = readLine().split(" ").map { it.toInt() }
    box = Array(n) { Array(m) { IntArray(h) } }
    val startNodes: Queue<Node> = LinkedList()

    repeat(h) { z ->
        repeat(n) { x ->
            val st = StringTokenizer(readLine(), " ")

            repeat(m) { y ->
                box[x][y][z] = st.nextToken().toInt()
                if (box[x][y][z] == 1) startNodes.offer(Node(x, y, z))
            }
        }
    }

    bfs(startNodes, n, m, h)
    
    box.forEach { arr ->
        arr.forEach { ints ->
            ints.forEach { num ->
                if (num == 0) day = 0
            }
        }
    }
    
    bw.write("${day - 1}")
    bw.flush()
    bw.close()
}

fun bfs(startNodes: Queue<Node>, n: Int, m: Int, h: Int) {
    val q: Queue<Node> = LinkedList()
    startNodes.forEach { q.offer(it) }
    q.offer(Node(-1, -1, -1))

    while (q.isNotEmpty()) {
        val target = q.poll()

        if (target.x == -1 && target.y == -1 && target.z == -1) {
            day++
            if (q.isNotEmpty()) q.offer(Node(-1, -1, -1))
        }

        for (i in 0 until 6) {
            val nx = target.x + dx[i]
            val ny = target.y + dy[i]
            val nz = target.z + dz[i]

            if (nx !in 0 until n || ny !in 0 until m || nz !in 0 until h ||
                box[nx][ny][nz] == 1 || box[nx][ny][nz] == -1) {
                continue
            }

            box[nx][ny][nz] = 1
            q.offer(Node(nx, ny, nz))
        }
    }
}