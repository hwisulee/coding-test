import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

var answer = 0
val virus = ArrayList<Pair<Int,Int>>()
val dx = intArrayOf(-1, 0, 1, 0)
val dy = intArrayOf(0, -1, 0, 1)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val visited = Array(n) { BooleanArray(m) }
    val map = Array(n) { i ->
        val st = StringTokenizer(readLine())
        IntArray(m) { j ->
            val cur = st.nextToken().toInt()
            if (cur == 2) virus += Pair(i, j)
            cur
        }
    }
    combination(0, 0, n, m, map, visited)

    bw.write("$answer")
    bw.flush()
    bw.close()
}

fun combination(idx: Int, cnt: Int, n: Int, m: Int, map: Array<IntArray>, visited: Array<BooleanArray>) {
    if (cnt == 3) {
        answer = answer.coerceAtLeast(bfs(n, m, map))
        return
    }

    for (i in idx until n * m) {
        val row = i / m
        val col = i % m
        if (map[row][col] != 0) continue
        map[row][col] = 1
        combination(i + 1, cnt + 1, n, m, map, visited)
        map[row][col] = 0
    }
}

fun bfs(n: Int, m: Int, map: Array<IntArray>): Int {
    val queue: Queue<Pair<Int, Int>> = LinkedList()
    repeat(virus.size) { queue += virus[it] }

    val copiedMap = Array(n) { IntArray(m) }
    repeat(n) { i ->
        repeat(m) { j -> copiedMap[i][j] = map[i][j] }
    }

    while (queue.isNotEmpty()) {
        val cur = queue.poll()
        for (i in 0 until 4) {
            val nx = cur.first + dx[i]
            val ny = cur.second + dy[i]
            if (nx !in 0 until n || ny !in 0 until m) continue
            if (copiedMap[nx][ny] == 0) {
                copiedMap[nx][ny] = 2
                queue += Pair(nx, ny)
            }
        }
    }

    return copiedMap.sumOf { it.count { num -> num == 0 } }
}