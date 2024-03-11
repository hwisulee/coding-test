import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input = readLine()
    while (true) {
        if (!input.contains("()")) break
        input = input.replace("()", "")
    }
    bw.write("${input.length}")
    bw.flush()
    bw.close()
}