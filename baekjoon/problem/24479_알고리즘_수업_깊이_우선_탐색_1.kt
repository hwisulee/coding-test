import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var result = 1

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m, r) = readLine().split(" ").map { it.toInt() }
    val tree = Array<MutableList<Int>>(n + 1) { mutableListOf() }
    val visited = IntArray(n + 1) { 0 }

    repeat(m) {
        val (u, v) = readLine().split(" ").map { it.toInt() }
        tree[u].add(v)
        tree[v].add(u)
    }

    tree.forEach { it.sort() }
    dfs(r, visited, tree)

    visited.forEachIndexed { index, i -> if (index != 0) bw.appendLine("$i") }
    bw.flush()
    bw.close()
}

fun dfs(node: Int, visited: IntArray, tree: Array<MutableList<Int>>) {
    if (visited[node] != 0) return
    visited[node] = result++
    tree[node].forEach { dfs(it, visited, tree) }
}