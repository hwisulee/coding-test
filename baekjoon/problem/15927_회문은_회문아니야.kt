import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
    val arr = BooleanArray(2) { true }
    val result = input.length
    for (i in 0 until result / 2) {
        if (input[i] != input[result - i - 1]) {
            arr[1] = false
            break
        }
        else if (input[i] != input[i + 1]) arr[0] = false
    }

    bw.write(if (arr[1]) if (arr[0]) "-1" else "${result - 1}" else "$result")
    bw.flush()
    bw.close()
}