import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = IntArray(n + 1) { 1 }
    (2 .. n).forEach { arr[it] = (arr[it - 2] + arr[it - 1]) % 10007 }

    bw.write("${arr[n]}")
    bw.flush()
    bw.close()
}