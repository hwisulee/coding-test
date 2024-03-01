import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine()
    readLine().also {
        bw.write("${it.replace("[^a|e|i|o|u]".toRegex(), "").length}")
    }
    bw.flush()
    bw.close()
}