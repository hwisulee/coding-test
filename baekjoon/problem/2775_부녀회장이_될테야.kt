import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    val arr = Array(15) { Array(15) { 0 } }
    (0 .. 14).forEach { i -> (0 .. 14).forEach { j -> if (i == 0 || j == 0) arr[i][j] = j + 1 else arr[i][j] = arr[i - 1][j] + arr[i][j - 1] } }

    repeat(t) {
        val k = br.readLine().toInt()
        val n = br.readLine().toInt()
        bw.appendLine("${arr[k][n - 1]}")
    }

    bw.flush()
    bw.close()
}