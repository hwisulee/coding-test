import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.pow

data class Fraction(val numerator: Long, val denominator: Long)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val fraction = convertDecimalToFraction(readLine())
        bw.appendLine("${fraction.numerator}/${fraction.denominator}")
    }
    bw.flush()
    bw.close()
}

fun convertDecimalToFraction(decimal: String): Fraction {
    val nrp = decimal.substringBefore('(')
    val nrpl = nrp.substringAfter('.', "").length

    val rp = decimal.substringAfter('(', "").substringBefore(')')
    val rpl = rp.length

    return if (rp.isEmpty()) {
        val scale = 10.0.pow(nrpl).toLong()
        val numerator = (decimal.toDouble() * scale).toLong()

        simplifyFraction(numerator, scale)
    } else {
        val integerPart = nrp.substringBefore('.').toLong()
        val npDecimal = nrp.substringAfter('.', "")
        val npDecimalValue = if (npDecimal.isEmpty()) 0L else npDecimal.toLong()

        val numerator = integerPart * 10.0.pow(nrpl + rpl).toLong() +
                npDecimalValue * 10.0.pow(rpl).toLong() +
                rp.toLong() -
                integerPart * 10.0.pow(nrpl).toLong() -
                npDecimalValue

        val denominator = (10.0.pow(rpl) - 1).toLong() * 10.0.pow(nrpl).toLong()

        simplifyFraction(numerator, denominator)
    }
}

fun simplifyFraction(numerator: Long, denominator: Long): Fraction {
    val gcdValue = gcd(numerator, denominator)
    return Fraction(numerator / gcdValue, denominator / gcdValue)
}

fun gcd(a: Long, b: Long): Long = if (b == 0L) abs(a) else gcd(b, a % b)