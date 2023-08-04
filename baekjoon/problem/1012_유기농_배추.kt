import java.io.*

val dx = arrayOf(0, 0, 1, -1)
val dy = arrayOf(1, -1, 0, 0)
lateinit var map: Array<Array<Int>>
var n = 0
var m = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val mnk = br.readLine().split(" ")
        m = mnk[0].toInt()
        n = mnk[1].toInt()
        val k = mnk[2].toInt()
        var cnt = 0

        map = Array(n) { Array(m) { 0 } }
        repeat(k) {
            val xy = br.readLine().split(" ").map { it.toInt() }
            map[xy[1]][xy[0]] = 1
        }

        repeat(n) { x ->
            repeat(m) { y ->
                if (dfs(x, y)) cnt++
            }
        }

        bw.appendLine("$cnt")
    }

    bw.flush()
    bw.close()
}

fun dfs(x: Int, y: Int): Boolean {
    if (map[x][y] == 0) return false
    map[x][y] = 0

    for (i in 0 until 4) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx !in 0 until n || ny !in 0 until m || map[nx][ny] == 0) continue
        dfs(nx, ny)
    }

    return true
}