import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input = readLine()
    while (input != "0") {
        var arr = arrayOf<String>()
        repeat(input.toInt()) {
            arr += readLine()
        }
        arr.sortBy { it.lowercase() }
        bw.appendLine(arr[0])

        input = readLine()
    }
    bw.flush()
    bw.close()
}