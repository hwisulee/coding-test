import java.io.*
import java.util.StringTokenizer
import kotlin.math.max
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m, b) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n) { IntArray(m) { 0 } }
    repeat(n) {
        val st = StringTokenizer(br.readLine(), " ")
        for (i in 0 until m) arr[it][i] = st.nextToken().toInt()
    }

    var minY = 0
    var maxY = 257

    for (i in 0 until n) {
        for (j in 0 until m) {
            val height = arr[i][j]
            minY = min(minY, height)
            maxY = max(maxY, height)
        }
    }

    var mining = Int.MAX_VALUE
    var result = 0

    for (i in minY .. maxY) {
        var backpack = b
        var time = 0

        for (x in 0 until n) {
            for (y in 0 until m) {
                when {
                    arr[x][y] < i -> { // setting block
                        val d = i - arr[x][y]
                        time += d
                        backpack -= d
                    }
                    arr[x][y] > i -> { // mining block
                        val d = arr[x][y] - i
                        time += d * 2
                        backpack += d
                    }
                }
            }
        }

        if (backpack >= 0 && time <= mining) {
            mining = time
            result = i
        }
    }

    bw.write("$mining $result")
    bw.flush()
    bw.close()
}