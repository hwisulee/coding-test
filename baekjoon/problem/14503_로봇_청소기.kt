import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

var answer = 0
val dx = arrayOf(-1, 0, 1, 0)
val dy = arrayOf(0, 1, 0, -1)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    var (r, c, d) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) {
        val st = StringTokenizer(readLine())
        IntArray(m) { st.nextToken().toInt() }
    }

    pattern@ while (true) {
        if (map[r][c] == 0) {
            map[r][c] = 2
            answer++
        } else if (map[r][c] == 1) {
            break@pattern
        }

        for (i in 0 until 4) {
            if (--d == -1) d = 3
            val nx = r + dx[d]
            val ny = c + dy[d]

            if (map[nx][ny] == 0) {
                r = nx
                c = ny
                continue@pattern
            }
        }

        r -= dx[d]
        c -= dy[d]
    }

    bw.write("$answer")
    bw.flush()
    bw.close()
}