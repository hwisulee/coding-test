import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val sb = StringBuilder()
        val input = readLine()
        var temp = input[0].also { sb.append(it) }
        for (i in 1 until input.length) {
            if (temp != input[i]) {
                temp = input[i]
                sb.append(input[i])
            }
        }

        bw.write(sb.toString())
        if (it < n) bw.write("\n")
        bw.flush()
    }

    bw.close()
}