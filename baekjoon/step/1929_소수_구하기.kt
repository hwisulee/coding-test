import java.io.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    (n .. m).map { if (isPrime(it.toLong())) bw.appendLine("$it") }
    bw.flush()
    bw.close()
}

fun isPrime(n: Long): Boolean {
    if (n <= 1) return false
    return (2 .. sqrt(n.toDouble()).toInt()).none { n % it == 0.toLong() }
}