import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input = readLine()
    while (input != null) {
        bw.appendLine(input)
        input = readLine()
    }
    bw.flush()
    bw.close()
}