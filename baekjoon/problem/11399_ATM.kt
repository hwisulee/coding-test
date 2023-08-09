import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    var sum = 0

    for (i in arr.indices) {
        for (j in 0 .. i) sum += arr[j]
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}