import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val polynomial = readLine()

    bw.write(differentiate(polynomial))
    bw.flush()
    bw.close()
}

fun differentiate(polynomial: String): String {
    val terms = mutableListOf<String>()
    var currentTerm = StringBuilder()
    var sign = 1

    for (char in polynomial) {
        when (char) {
            '+' -> {
                if (currentTerm.isNotEmpty()) terms += if (sign == -1) "-$currentTerm" else currentTerm.toString()
                currentTerm = StringBuilder()
                sign = 1
            }
            '-' -> {
                if (currentTerm.isNotEmpty()) terms += if (sign == -1) "-$currentTerm" else currentTerm.toString()
                currentTerm = StringBuilder()
                sign = -1
            }
            else -> currentTerm.append(char)
        }
    }
    if (currentTerm.isNotEmpty()) terms += if (sign == -1) "-$currentTerm" else currentTerm.toString()

    val result = mutableListOf<String>()
    for (term in terms) {
        if (term.contains("x")) {
            val coefficient = when (term) {
                "x" -> 1
                "-x" -> -1
                else -> term.replace("x", "").toInt()
            }
            val newCoefficient = coefficient * 1
            if (newCoefficient != 0) result.add(newCoefficient.toString())
        }
    }

    return if (result.isEmpty()) "0" else result.joinToString(" + ").replace(" + -", " - ")
}