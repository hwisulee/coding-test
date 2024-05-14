import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.max

lateinit var map: Array<MutableList<Int>>
lateinit var visited: Array<BooleanArray>
val dx = intArrayOf(0, 1, 0, -1)
val dy = intArrayOf(1, 0, -1, 0)
val xy = IntArray(2)
var result = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (x, y) = readLine().split(" ").map { it.toInt() }
    xy[0] = x.also { xy[1] = y }
    map = Array(x) { mutableListOf() }
    visited = Array(x) { BooleanArray(y) }

    repeat(x) { idx ->
        readLine().split(" ").map { it.toInt() }.also {
            map[idx].addAll(it)
        }
    }

    repeat(x) { a ->
        repeat(y) { b ->
            visited[a][b] = true
            dfs(a, b, 1, map[a][b])
            visited[a][b] = false
            restOfShapes(a, b)
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}

fun dfs(x: Int, y: Int, depth: Int, sum: Int) {
    if (depth == 4) {
        result = max(result, sum)
        return
    }

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx in 0 until xy[0] && ny in 0 until xy[1] && !visited[nx][ny]) {
            visited[nx][ny] = true
            dfs(nx, ny, depth + 1, sum + map[nx][ny])
            visited[nx][ny] = false
        }
    }
}

fun restOfShapes(x: Int, y: Int) {
    if (y - 1 in 0 until xy[1] && y + 1 in 0 until xy[1]) {
        val value = map[x][y] + map[x][y - 1] + map[x][y + 1]
        if (x + 1 in 0 until xy[0]) result = max(result, value + map[x + 1][y])
        if (x - 1 in 0 until xy[0]) result = max(result, value + map[x - 1][y])
    }

    if (x - 1 in 0 until xy[0] && x + 1 in 0 until xy[0]) {
        val value = map[x][y] + map[x - 1][y] + map[x + 1][y]
        if (y - 1 in 0 until xy[1]) result = max(result, value + map[x][y - 1])
        if (y + 1 in 0 until xy[1]) result = max(result, value + map[x][y + 1])
    }
}