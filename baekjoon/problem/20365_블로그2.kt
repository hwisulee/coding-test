import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val input = readLine()
    val arr = IntArray(2) { 0 }

    for (i in input.indices) {
        val cur = input[i]
        if (i == 0) {
            if (cur == 'B') arr[0]++ else arr[1]++
        } else {
            if (input[i - 1] == cur) {
                continue
            } else {
                if (cur == 'B') arr[0]++ else arr[1]++
            }
        }
    }

    bw.write("${if (arr[1] >= arr[0]) arr[0] + 1 else arr[1] + 1}")
    bw.flush()
    bw.close()
}