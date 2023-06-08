import java.io.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val n = br.readLine().toInt()

        if (n != 0) {
            bw.appendLine("${(n + 1 .. n * 2).count { isPrime(it.toLong()) }}")
        } else {
            break
        }
    }

    bw.flush()
    bw.close()
}

fun isPrime(n: Long): Boolean {
    if (n <= 1) return false
    return (2 .. sqrt(n.toDouble()).toInt()).none { n % it == 0.toLong() }
}