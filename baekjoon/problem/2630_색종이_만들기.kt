import java.io.*

var result = intArrayOf(0, 0)

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val tree = Array(n) { br.readLine().split(" ").map { it.toInt() }.toIntArray() }
    dfs(0, 0, n, tree)

    bw.appendLine("${result[0]}").append("${result[1]}")
    bw.flush()
    bw.close()
}

fun dfs(r: Int, c: Int, size: Int, tree: Array<IntArray>) {
    var zero = true
    var one = true

    (r until r + size).forEach { i ->
        (c until c + size).forEach { if (tree[i][it] == 0) one = false else zero = false }
    }

    if (zero) { result[0]++; return }
    if (one) { result[1]++; return }

    dfs(r, c, size / 2, tree)
    dfs(r, c + size / 2, size / 2, tree)
    dfs(r + size / 2, c, size / 2, tree)
    dfs(r + size / 2, c + size / 2, size / 2, tree)
}