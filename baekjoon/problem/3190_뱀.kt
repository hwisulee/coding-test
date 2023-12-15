import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayDeque

val dx = listOf(-1, 0, 1, 0)
val dy = listOf(0, 1, 0, -1)

data class Cmd (val x: Int, val c: String)
data class Snake (val x: Int, val y: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val map = Array(n) { IntArray(n) }

    val k = readLine().toInt()
    repeat(k) {
        val (x, y) = readLine().split(" ").map { it.toInt() - 1 }
        map[x][y] = 1
    }

    val l = readLine().toInt()
    val dirList: Queue<Cmd> = LinkedList()
    repeat(l) {
        val (x, c) = readLine().split(" ")
        dirList += Cmd(x.toInt(), c)
    }

    val snake = ArrayDeque<Snake>()
    snake += Snake(0, 0)
    var dir = 1
    var cnt = 0

    while (true) {
        val nx = snake.first().x + dx[dir]
        val ny = snake.first().y + dy[dir]
        snake.addFirst(Snake(nx, ny))

        if (!(snake.first().x in map.indices && snake.first().y in map[0].indices)) break
        if (map[nx][ny] == 9) break
        if (map[nx][ny] != 1) {
            val last = snake.removeLast()
            map[last.x][last.y] = 0
        }
        map[nx][ny] = 9

        cnt++
        dirList.peek()?.let {
            val cur = dirList.peek()
            if (cnt == cur.x) {
                dirList.poll()
                when (cur.c) {
                    "L" -> dir = (dir + 3) % 4
                    "D" -> dir = (dir + 1) % 4
                }
            }
        }
    }
    bw.write("${++cnt}")
    bw.flush()
    bw.close()
}