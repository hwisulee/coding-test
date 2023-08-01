import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val l = br.readLine().toInt()
    val str = br.readLine()
    val mod = 1234567891
    var r: Long = 1
    var sum: Long = 0

    for (i in str.indices) {
        sum = (sum + (str[i] - 'a' + 1) * r) % mod
        r = (r * 31) % mod
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}