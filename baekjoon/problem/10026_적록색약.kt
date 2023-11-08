import java.io.BufferedWriter
import java.io.OutputStreamWriter

var result = intArrayOf(0, 0)
val dx = arrayOf(-1, 1, 0, 0)
val dy = arrayOf(0, 0, -1, 1)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val map1 = Array(n) { Array(n) { ' ' } }
    val map2 = Array(n) { Array(n) { ' ' } }
    repeat(n) { i ->
        val line = readLine()
        repeat(n) { j ->
            map1[i][j] = line[j]
            if (line[j] == 'G') map2[i][j] = 'R' else map2[i][j] = line[j]
        }
    }

    repeat(n) { x ->
        repeat(n) { y ->
            if (dfs(n, x, y, map1)) result[0]++
            if (dfs(n, x, y, map2)) result[1]++
        }
    }

    bw.write(result.joinToString(" "))
    bw.flush()
    bw.close()
}

fun dfs(n: Int, x: Int, y: Int, map: Array<Array<Char>>): Boolean {
    if (map[x][y] == ' ') return false

    val color = map[x][y]
    map[x][y] = ' '

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]
        if (nx !in 0 until n || ny !in 0 until n || color != map[nx][ny]) continue
        dfs(n, nx, ny, map)
    }

    return true
}