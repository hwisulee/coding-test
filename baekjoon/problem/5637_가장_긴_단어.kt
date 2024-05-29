import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var word = ""
    var input: String
    while (true) {
        input = readLine()

        val max = input.split(" ").filterNot { it == "E-N-D" }
            .map { it.replace("[^a-zA-Z-]".toRegex(), "") }.maxBy { it.length }
        if (word.length < max.length) word = max
        if (input.contains("E-N-D")) break
    }

    bw.write(word.lowercase())
    bw.flush()
    bw.close()
}