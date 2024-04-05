import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    while (true) {
        val input = readLine()
        if (input.isNullOrEmpty()) break
        sb.appendLine(input)
    }
    
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}