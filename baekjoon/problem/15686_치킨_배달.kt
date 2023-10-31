import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs
import kotlin.math.min

var answer = Int.MAX_VALUE
val house = ArrayList<Pair<Int, Int>>()
val store = ArrayList<Pair<Int, Int>>()

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val map = Array(n) { i ->
        val st = StringTokenizer(readLine())
        IntArray(n) { j ->
            val cur = st.nextToken().toInt()
            if (cur == 1) house += Pair(i, j)
            if (cur == 2) store += Pair(i, j)
            cur
        }
    }

    val visited = BooleanArray(store.size)
    dfs(0, 0, n, m, map, visited)
    bw.write("$answer")
    bw.flush()
    bw.close()
}

fun dfs(idx: Int, cnt: Int, n: Int, m: Int, map: Array<IntArray>, visited: BooleanArray) {
    if (cnt == m) {
        var distance = 0
        house.forEach { h ->
            var cur = Int.MAX_VALUE
            for ((i, s) in store.withIndex()) {
                if (visited[i]) {
                    if (cur == 1) break
                    cur = min(cur, abs(h.first - s.first) + abs(h.second - s.second))
                }
            }
            distance += cur
        }
        answer = min(answer, distance)
        return
    }

    for (i in idx until store.size) {
        visited[i] = true
        dfs(i + 1, cnt + 1, n, m, map, visited)
        visited[i] = false
    }
}