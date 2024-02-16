import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine()

        if (input == "0") break
        bw.appendLine("${repeater(input)}")
    }

    bw.flush()
    bw.close()
}

fun repeater(n: String): BigInteger {
    val sum = n.chunked(1).sumOf { it.toBigInteger() }
    return if (sum.toString().length > 1) repeater(sum.toString()) else sum
}