import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var idx = 1
    while (true) {
        val input = Array(2) { readLine() }

        if (input.distinct().joinToString() == "END") break
        val a = input[0].groupingBy { it }.eachCount()
        val b = input[1].groupingBy { it }.eachCount()

        val result = if (a == b) "same" else "different"
        bw.appendLine("Case $idx: $result")
        bw.flush()
        idx++
    }
    
    bw.close()
}
