import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val sb = StringBuilder()
        val arr = IntArray(26) { 0 }
        val input = readLine()
        var idx = 0
        while (true) {
            if (idx >= input.length) break

            sb.append(input[idx])
            val cur = input[idx] - 'A'
            arr[cur]++

            if (arr[cur] == 3) {
                sb.append(input[idx])
                arr[cur] = 0
                idx++
            }

            idx++
        }

        bw.write(if (input == sb.toString()) "OK" else "FAKE")
        if (it < n) bw.append("\n")
        bw.flush()
    }

    bw.close()
}