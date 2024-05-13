import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val score = IntArray(5) {
        val num = readLine().toInt()
        if (num < 40) 40 else num
    }.average()

    bw.write("${score.toInt()}")
    bw.flush()
    bw.close()
}