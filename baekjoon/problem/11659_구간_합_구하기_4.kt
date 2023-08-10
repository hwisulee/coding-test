import java.io.*
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val arr = IntArray(n + 1) { 0 }
    StringTokenizer(br.readLine()).run { for (i in 1 .. n) { arr[i] = arr[i - 1] + nextToken().toInt() } }
    repeat(m) {
        val (i, j) = br.readLine().split(" ").map { it.toInt() }
        bw.appendLine("${arr[j] - arr[i - 1]}")
    }
    bw.flush()
    bw.close()
}