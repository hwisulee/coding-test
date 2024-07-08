import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

lateinit var arr: IntArray
lateinit var visited: BooleanArray

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    arr = IntArray(n + 1) { i -> i }
    visited = BooleanArray(n + 1)
    dfs(n, m, 1, 0, bw, "")

    bw.flush()
    bw.close()
}

fun dfs(n: Int, m: Int, idx: Int, depth: Int, bw: BufferedWriter, str: String) {
    if (depth == m) {
        bw.appendLine(str)
    }

    for (i in idx .. n) {
        if (!visited[i]) {
            visited[i] = true

            if (depth == 0) dfs(n, m, i, 1, bw, arr[i].toString())
            else dfs(n, m, i, depth + 1, bw, "$str ${arr[i]}")
            visited[i] = false
        }
    }
}