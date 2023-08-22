import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var result = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val map = Array(n) { Array(m) { "" } }
    val player = intArrayOf(0, 0)
    repeat(n) { i ->
        br.readLine().also {
            for (j in it.indices) {
                map[i][j] = it[j].toString()
                if (map[i][j] == "I") { player[0] = i; player[1] = j; }
            }
        }
    }

    val dx = intArrayOf(-1, 1, 0, 0)
    val dy = intArrayOf(0, 0, -1, 1)
    val visited = Array(n) { BooleanArray(m) { false } }
    dfs(n, m, player[0], player[1], dx, dy, visited, map)

    if (result == 0) bw.write("TT") else bw.write("$result")
    bw.flush()
    bw.close()
}

fun dfs(n: Int, m: Int, x: Int, y: Int, dx: IntArray, dy: IntArray, visited: Array<BooleanArray>, map: Array<Array<String>>) {
    visited[x][y] = true

    if (map[x][y] == "P") result++

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx >= 0 && ny >= 0 && nx < n && ny < m && !visited[nx][ny]) {
            if (map[nx][ny] != "X") { dfs(n, m, nx, ny, dx, dy, visited, map) }
        }
    }
}