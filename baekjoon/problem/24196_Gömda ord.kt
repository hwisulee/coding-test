import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val input = readLine()

    var index = 0
    while (true) {
        if (index >= input.length) break
        if (index == 0) {
            sb.append(input[0])
            index += input[0] - 'A' + 1
        }

        val cur = input[index]
        sb.append(cur)
        index += cur - 'A' + 1
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}