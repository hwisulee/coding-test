import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (readLine().also { input = it } != null) {
        while (input!!.contains("BUG")) input = input!!.replace("BUG", "")
        bw.appendLine(input)
    }
    bw.flush()
    bw.close()
}