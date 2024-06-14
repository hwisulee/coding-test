import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    repeat(readLine().toInt()) {
        val input = readLine()
        val cnt = IntArray(10)

        for (i in input.lastIndex downTo 1) {
            if (input[i - 1] < input[i]) {
                for (j in i - 1 until input.length) {
                    cnt[input[j] - '0']++
                }

                sb.append(input.substring(0, i - 1))

                for (j in input[i - 1] - '0' + 1 until 10) {
                    if (cnt[j] > 0) {
                        cnt[j]--
                        sb.append(j)
                        break
                    }
                }
                for (j in 0 until 10) {
                    while (cnt[j]-- > 0) {
                        sb.append(j)
                    }
                }
                sb.append("\n")
                break
            }
            if (i == 1) sb.appendLine("BIGGEST")
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}