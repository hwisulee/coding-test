import java.io.*

val dfsList = mutableListOf<Int>()
val bfsList = mutableListOf<Int>()

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m, v) = br.readLine().split(" ").map { it.toInt() }
    val graph = Array(n) { MutableList(n) { 0 } }
    val visited = BooleanArray(n)
    repeat(m) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        graph[x - 1][y - 1] = 1
        graph[y - 1][x - 1] = 1
    }

    visited.fill(false)
    dfs(n, v - 1, BooleanArray(n + 1), graph)


    visited.fill(false)
    bfs(n, v - 1, BooleanArray(n + 1), graph)
    
    bw.write("${dfsList.joinToString(" ")}\n${bfsList.joinToString(" ")}")
    bw.flush()
    bw.close()
}

fun dfs(n: Int , v: Int, visited: BooleanArray, tree: Array<MutableList<Int>>) {
    visited[v] = true
    dfsList.add(v + 1)

    for (i in 0 until n) { if (tree[v][i] == 1 && !visited[i]) dfs(n, i, visited, tree) }
}

fun bfs(n: Int, v: Int, visited: BooleanArray, tree: Array<MutableList<Int>>) {
    val queue = ArrayDeque<Int>()
    visited[v] = true
    queue.add(v)
    bfsList.add(v + 1)

    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()

        for (i in 0 until n) {
            if (tree[current][i] == 1 && !visited[i]) {
                queue.add(i)
                visited[i] = true
                bfsList.add(i + 1)
            }
        }
    }
}