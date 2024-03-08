import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine()
        if (input == "EOI") break else bw.appendLine(if (input.lowercase().contains("nemo")) "Found" else "Missing")
    }
    bw.flush()
    bw.close()
}