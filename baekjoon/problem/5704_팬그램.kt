import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        if (input == "*") break

        val alphabet = IntArray(26) { 0 }
        input.forEach {
            if (!it.isWhitespace()) alphabet[it.code - 97]++
        }

        bw.appendLine(if (alphabet.filter { it > 0 }.size == 26) "Y" else "N")
    }

    bw.flush()
    bw.close()
}