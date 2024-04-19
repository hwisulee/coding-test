import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().toInt().let { n ->
        bw.write("${(1 .. n).map { it }.joinToString("").indexOf("$n") + 1}")
    }

    bw.flush()
    bw.close()
}