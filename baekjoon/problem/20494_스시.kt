import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    repeat(readLine().toInt()) {
        cnt += readLine().count()
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}
