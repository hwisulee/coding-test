import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        if (input == "#") break

        input.count { it == '1' }.also {
            val num = it % 2
            val check = input.last()
            val temp = input.slice(0 until input.lastIndex)

            when (check) {
                'e' -> when (num) {
                    0 -> bw.write("${temp}0")
                    else -> bw.write("${temp}1")
                }
                else -> when (num) {
                    0 -> bw.write("${temp}1")
                    else -> bw.write("${temp}0")
                }
            }
        }

        bw.append("\n")
        bw.flush()
    }

    bw.close()
}