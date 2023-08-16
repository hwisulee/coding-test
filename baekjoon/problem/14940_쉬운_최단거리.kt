import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val dir = arrayOf(arrayOf(0, 1), arrayOf(1, 0), arrayOf(0, -1), arrayOf(-1, 0))

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val visited = Array(n) { BooleanArray(m) { false } }
    var sr = -1
    var sc = -1


    val tree = Array(n) { x ->
        val st = StringTokenizer(br.readLine())
        
        IntArray(m) { y ->
            val node = st.nextToken().toInt()
            if (node == 2) { sr = x; sc = y }
            node
        }
    }

    bfs(sr, sc, n, m, tree, visited)

    for (r in 0 until n) {
        for (c in 0 until m) {
            if (tree[r][c] == 0) { bw.write("0 "); continue }
            if (visited[r][c]) bw.write("${tree[r][c]} ")
            else bw.write("-1 ")
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()
}

fun bfs(i: Int, j: Int, n: Int, m: Int, tree: Array<IntArray>, visited: Array<BooleanArray>) {
    val queue: Queue<Pair<Int, Int>> = LinkedList<Pair<Int, Int>>()
    queue.add(Pair(i, j))
    tree[i][j] = 0
    visited[i][j] = true

    while (queue.isNotEmpty()) {
        val (r, c) = queue.poll()

        for (i in 0 until 4) {
            val nR = r + dir[i][0]
            val nC = c + dir[i][1]

            if (nR < 0 || nR >= n || nC < 0 || nC >= m) continue
            if (visited[nR][nC]) continue
            if (tree[nR][nC] == 0 ) { visited[nR][nC] = true; continue }

            tree[nR][nC] = tree[r][c] + 1
            visited[nR][nC] = true
            queue.add(Pair(nR, nC))
        }
    }
}