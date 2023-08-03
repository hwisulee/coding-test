import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = IntArray(n) { br.readLine().toInt() }.sorted()
    val limit = Math.round(n * 0.15).toInt()

    var sum = 0
    for (i in limit until n - limit) sum += arr[i]
    
    bw.write("${Math.round(sum.toDouble() / (n - limit * 2)).toInt()}")
    bw.flush()
    bw.close()
}