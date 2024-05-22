import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        bw.appendLine("${readLine().substringBefore("D").count()}")
        bw.flush()
    }
    
    bw.close()
}