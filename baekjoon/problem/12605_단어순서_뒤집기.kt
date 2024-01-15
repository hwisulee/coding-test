import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val line = readLine() ?: break
        
    }
    bw.flush()
    bw.close()
}