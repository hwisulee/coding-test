import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    readLine().onEach { i -> when (i) { 'a', 'e', 'i', 'o', 'u' -> cnt++ } }
    bw.write("$cnt")
    bw.flush()
    bw.close()
}