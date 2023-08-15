import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val tree = Array(n + 1) { MutableList(n + 1) { 0 } }
    val visited = Array(n + 1) { false }
    var cnt = 0

    repeat(m) {
        val (u, v) = br.readLine().split(" ").map { it.toInt() }
        tree[u][v] = 1
        tree[v][u] = 1
    }

    for (i in 1 .. n) {
        if (!visited[i]) {
            bfs(i, n, tree, visited)
            cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}

fun bfs(node: Int, n: Int, tree: Array<MutableList<Int>>, visited: Array<Boolean>): Array<Boolean> {
    val queue = ArrayDeque<Int>()
    queue.add(node)
    visited[node] = true

    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        for (i in 1 .. n) {
            if (!visited[i] && tree[current][i] == 1) {
                visited[i] = true
                queue.add(i)
            }
        }
    }

    return visited
}