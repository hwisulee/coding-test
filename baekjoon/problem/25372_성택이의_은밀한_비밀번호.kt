import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        readLine().also {
            bw.appendLine(if (it.length in 6 .. 9) "yes" else "no")
        }
    }
    bw.flush()
    bw.close()
}