import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val score = IntArray(2)
    val input = readLine()
    for (i in 1 until input.length step 2) {
        when (input[i - 1]) {
            'A' -> score[0] += input[i].digitToInt()
            'B' -> score[1] += input[i].digitToInt()
        }
    }

    bw.write(if (score[0] > score[1]) "A" else "B")
    bw.flush()
    bw.close()
}