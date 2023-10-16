import java.io.BufferedWriter
import java.io.OutputStreamWriter

val dx = listOf(0, 1, 0, -1)
val dy = listOf(1, 0, -1, 0)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val map = mutableListOf<List<String>>()
    repeat(n) { map += readLine().chunked(1) }

    val visited = Array(n + 1) { Array(n + 1) { false } }
    val result = mutableListOf<Int>()
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (!visited[i][j] && map[i][j] == "1") result += dfs(i, j, n, visited, map)
        }
    }

    bw.appendLine("${result.size}")
    result.sorted().forEach { bw.appendLine("$it") }
    bw.flush()
    bw.close()
}

fun dfs(x: Int, y: Int, n: Int, visited: Array<Array<Boolean>>, map: MutableList<List<String>>): Int {
    visited[x][y] = true
    var cnt = 1
    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]
        if (nx in 0 until n && ny in 0 until n && !visited[nx][ny] && map[nx][ny] == "1") {
            cnt += dfs(nx, ny, n, visited, map)
        }
    }

    return cnt
}