import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.system.exitProcess

lateinit var parent: IntArray

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val nm = IntArray(2) { readLine().toInt() }
    parent = IntArray(nm[0] + 1)

    for (i in 1 .. nm[0]) {
        parent[i] = i
    }

    for (i in 1 .. nm[0]) {
        val cur = StringTokenizer(readLine())
        for (j in 1 .. nm[0]) {
            val link = cur.nextToken().toInt()
            if (j > i && link == 1) union(i, j)
        }
    }

    var start = -1
    val plan = StringTokenizer(readLine())
    for (i in 1 .. nm[1]) {
        val cur = plan.nextToken().toInt()
        if (start == -1) start = find(cur)
        if (start != find(cur)) {
            with(bw) {
                write("NO")
                flush()
                close()
            }

            exitProcess(0)
        }
    }

    with(bw) {
        write("YES")
        flush()
        close()
    }
}

fun union(x: Int, y: Int) {
    val nx = find(x)
    val ny = find(y)

    return if (nx > ny) {
        parent[nx] = ny
    } else {
        parent[ny] = nx
    }
}

fun find(n: Int): Int = if (parent[n] == n) n else { parent[n] = find(parent[n]); parent[n] }