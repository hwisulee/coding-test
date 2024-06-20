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

        val count = input.split(" ").map { it[0].lowercaseChar() }.groupingBy { it }.eachCount().size
        bw.appendLine(if (count == 1) "Y" else "N")
    }
    bw.flush()
    bw.close()
}