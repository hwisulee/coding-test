import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val input = readLine().replace("[^a-zA-Z]".toRegex(), "").map { it.lowercaseChar() }.groupingBy { it }.eachCount().values
        when {
            input.filter { it >= 3 }.size == 26 -> printLnResult(bw, 3, it + 1)
            input.filter { it >= 2 }.size == 26 -> printLnResult(bw, 2, it + 1)
            input.filter { it >= 1 }.size == 26 -> printLnResult(bw, 1, it + 1)
            else -> printLnResult(bw, 0, it + 1)
        }
    }

    bw.close()
}

fun printLnResult(bw: BufferedWriter, result: Int, index: Int) {
    val state = when (result) {
        0 -> "Not a pangram"
        1 -> "Pangram!"
        2 -> "Double pangram!!"
        else -> "Triple pangram!!!"
    }

    bw.appendLine("Case $index: $state")
    bw.flush()
}