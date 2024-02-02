import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = mutableListOf<BigInteger>()
    repeat(n) {
        val input = readLine().replace("[a-z|A-Z]".toRegex(), " ")
        input.split(" ").filter { it.isNotEmpty() }.map { arr += it.toBigInteger() }
    }

    bw.write(arr.sorted().joinToString(" "))
    bw.flush()
    bw.close()
}