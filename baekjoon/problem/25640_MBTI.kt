import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val main = readLine()
    var sum = 0
    repeat(readLine().toInt()) {
        if (readLine() == main) sum++
    }

    bw.write("$sum")
    bw.flush()
    bw.close()
}