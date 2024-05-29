import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    repeat(readLine().toInt()) {
        val input = readLine()
        if (input.startsWith("Simon says")) {
            bw.appendLine(input.replace("Simon says ", ""))
        }
    }
    bw.flush()
    bw.close()
}