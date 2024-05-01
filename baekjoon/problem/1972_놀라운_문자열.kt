import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        if (input == "*") break

        var check = true
        val n = input.length - 2

        if (input.length >= 3) {
            var addition = 1
            for (i in 0 .. n) {
                val list = mutableListOf<String>()
                for (j in 0 .. n) {
                    try {
                        list += "${input[j]}${input[j + addition]}"
                    } catch (e: StringIndexOutOfBoundsException) {
                        continue
                    }
                }

                if (list.size != list.distinct().size) {
                    check = false
                    break
                }

                addition++
            }
        }

        bw.appendLine(if (check) "$input is surprising." else "$input is NOT surprising.")
        bw.flush()
    }

    bw.close()
}