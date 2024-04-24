import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = readLine().toInt()
    repeat(k) {
        var headCount = readLine().toInt()
        readLine().forEach {
            if (it == 'c') headCount++ else headCount--
        }

        bw.appendLine("Data Set ${it + 1}:").appendLine("$headCount\n")
    }
    bw.flush()
    bw.close()
}