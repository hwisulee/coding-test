import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = Array(n) { Array(m) { 0 } }
    var min = n * m

    for (i in 0 until n) {
        val line = br.readLine().chunked(1)

        for (j in 0 until m) {
            if (((i + j) % 2 == 0 && line[j] != "W") || ((i + j) % 2 != 0 && line[j] != "B")) arr[i][j]++
            if (j > 0) arr[i][j] += arr[i][j - 1]
        }
    }

    for (i in 0 .. n - 8) {
        for (j in 0 .. m - 8) {
            var cnt = 0

            for (k in i until i + 8) {
                cnt += arr[k][j + 7]

                if (j > 0) cnt -= arr[k][j - 1]
            }

            if (cnt > 64 - cnt) cnt = 64 - cnt
            if (cnt < min) min = cnt
        }
    }

    bw.write("$min")
    bw.flush()
    bw.close()
}