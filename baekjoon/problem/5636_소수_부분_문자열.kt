import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val primes = findPrimes(100000)
    var input: String?
    while (true) {
        input = readLine()
        if (input == "0") break

        for (i in primes.lastIndex downTo 0) {
            if (input.contains(primes[i].toString())) {
                bw.write("${primes[i]}\n")
                break
            }
        }
    }

    bw.flush()
    bw.close()
}

fun findPrimes(upperLimit: Int): List<Int> {
    if (upperLimit < 2) return emptyList()

    val isPrime = BooleanArray(upperLimit + 1) { true }
    isPrime[0] = false
    isPrime[1] = false

    for (i in 2..Math.sqrt(upperLimit.toDouble()).toInt()) {
        if (isPrime[i]) {
            for (j in i * i..upperLimit step i) {
                isPrime[j] = false
            }
        }
    }

    val primes = mutableListOf<Int>()
    for (i in 2..upperLimit) {
        if (isPrime[i]) {
            primes.add(i)
        }
    }

    return primes
}