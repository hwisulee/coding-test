import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }

    bw.write("${factorial(n) / (factorial(k) * factorial(n - k))}")
    bw.flush()
    bw.close()
}

fun factorial(n: Int): Int {
    if (n == 0) return 1

    return n * factorial(n - 1)
}