import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val a = Array(n) { IntArray(m) }
    val b = Array(n) { IntArray(m) }

    for (i in 0 until n) {
        val answer = br.readLine().split(" ").map { it.toInt() }

        for (j in 0 until m) {
            a[i][j] = answer[j]
        }
    }

    for (i in 0 until n) {
        val answer = br.readLine().split(" ").map { it.toInt() }

        for (j in 0 until m) {
            b[i][j] = answer[j]
        }
    }

    val ab = Array(a.size) { i ->
        bw.write("${IntArray(a[0].size) { j -> a[i][j] + b[i][j] }.joinToString(" ")}\n")
    }

    bw.flush()
    bw.close()
}