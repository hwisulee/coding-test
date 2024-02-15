import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var sum = 0
    readLine().forEach {
        if (it in 'a' .. 'z') sum += it.code - 96
        if (it in 'A' .. 'Z') sum += it.code - 38
    }

    bw.write(if (isPrime(sum)) "It is a prime word." else "It is not a prime word.")
    bw.flush()
    bw.close()
}

fun isPrime(n: Int): Boolean {
    if (n < 1) return false
    if (n == 1) return true
    return (2 .. sqrt(n.toDouble()).toInt()).none { n % it == 0 }
}