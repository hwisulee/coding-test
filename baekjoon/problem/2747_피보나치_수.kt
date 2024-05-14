import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    when (val input = readLine().toInt()) {
        0 -> bw.write("0")
        1 -> bw.write("1")
        else -> {
            val arr = IntArray(input + 1) { 1 }.also { it[0] = 0 }
            if (input > 2) {
                (3..input).forEach { arr[it] = (arr[it - 1] + arr[it - 2]) }
            }

            bw.write("${arr[input]}")
        }
    }
    bw.flush()
    bw.close()
}