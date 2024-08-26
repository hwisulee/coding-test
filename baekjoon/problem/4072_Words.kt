import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        if (input == "#") break

        val newStr = input
            .split(" ")
            .joinToString(" ") { it.reversed() }

        bw.appendLine("${newStr}")
    }
    bw.flush()
    bw.close()
}