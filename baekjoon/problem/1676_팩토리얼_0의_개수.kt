import java.io.*
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = factorial(br.readLine().toBigInteger(), 1.toBigInteger()).toString().reversed()
    bw.write("${str.slice(0 .. str.indexOfFirst { it != '0' }).count { it == '0' }}")
    bw.flush()
    bw.close()
}

fun factorial(n: BigInteger, acc: BigInteger): BigInteger {
    return if (n <= 1.toBigInteger()) acc
    else factorial(n - 1.toBigInteger(), n * acc)
}