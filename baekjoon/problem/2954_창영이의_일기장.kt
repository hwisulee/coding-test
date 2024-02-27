import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = arrayOf('a', 'e', 'i', 'o', 'u')
    val sb = StringBuilder()
    val input = readLine()
    var idx = 0
    while (idx < input.length) {
        var check = false
        for (i in arr.indices) {
            if (input[idx] == arr[i]) check = true
        }

        if (check) {
            sb.append("${input[idx]}")
            idx += 3
        } else {
            sb.append("${input[idx]}")
            idx++
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}