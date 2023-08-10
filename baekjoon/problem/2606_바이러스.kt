import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cNum = br.readLine().toInt()
    val connect = br.readLine().toInt()
    val tree = Array(cNum + 1) { mutableListOf<Int>() }
    repeat(connect) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        tree[x].add(y)
        tree[y].add(x)
    }

    bw.write("${bfs(cNum, tree)}")
    bw.flush()
    bw.close()
}

fun bfs(node: Int, tree: Array<MutableList<Int>>): Int {
    val queue = ArrayDeque<Int>()
    val visited = Array(node + 1) { false }
    queue.add(1)
    visited[1] = true

    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        tree[current].forEach {
            if (!visited[it]) {
                visited[it] = true
                queue.add(it)
            }
        }
    }

    return visited.filter { it }.size - 1
}