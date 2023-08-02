import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = Array(n) { Pair(0, 0) }
    val rank = IntArray(n) { 1 }

    repeat(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        arr[it] = Pair(x, y)
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (arr[i].first > arr[j].first && arr[i].second > arr[j].second) rank[j]++
        }
    }

    bw.write(rank.joinToString(" "))
    bw.flush()
    bw.close()
}
