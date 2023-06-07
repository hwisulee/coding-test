import java.io.*
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var num = br.readLine().toLong()

        while (true) {
           if (isPrime(num)) {
               bw.appendLine("$num")
               break
           } else {
               num++
           }
        }
    }
    bw.flush()
    bw.close()
}

fun isPrime(n: Long): Boolean {
    if (n <= 1) return false
    return (2 .. sqrt(n.toDouble()).toInt()).none { n % it == 0.toLong() }
}