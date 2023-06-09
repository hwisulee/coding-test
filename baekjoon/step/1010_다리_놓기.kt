import java.io.*
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (n, m) = br.readLine().split(" ").map { it.toBigInteger() }
        val acc = 1.toBigInteger()
        bw.appendLine("${factorial(m, acc) / (factorial((m - n), acc) * factorial(n, acc))}")
    }
    bw.flush()
    bw.close()
}

fun factorial(n: BigInteger, acc: BigInteger): BigInteger {
    return if (n <= 1.toBigInteger()) {
        acc
    } else {
        factorial(n - 1.toBigInteger(), n * acc)
    }
}