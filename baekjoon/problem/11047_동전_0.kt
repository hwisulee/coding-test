import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var (n, k) = br.readLine().split(" ").map { it.toInt() }
    var coin = intArrayOf()
    repeat(n) { coin += br.readLine().toInt() }

    var result = 0
    for (i in coin.size - 1 downTo 0) {
        if (k / coin[i] != 0) {
            result += k / coin[i]
            k %= coin[i]
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}