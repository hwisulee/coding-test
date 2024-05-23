import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val rule = arrayOf(
        arrayOf('`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '='),
        arrayOf('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', '[', ']', '\\'),
        arrayOf('A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';', '\''),
        arrayOf('Z', 'X', 'C', 'V', 'B', 'N', 'M', ',', '.', '/')
    )

    while (true) {
        val sb = StringBuilder()
        val input = readLine() ?: break
        if (input.isEmpty()) {
            sb.append("\n\n")
        } else {
            input.forEach {
                val idx: Int
                when (it) {
                    in rule[0] -> {
                        idx = rule[0].indexOf(it) - 1
                        sb.append(rule[0][if (idx == -1) 0 else idx])
                    }
                    in rule[1] -> {
                        idx = rule[1].indexOf(it) - 1
                        sb.append(rule[1][if (idx == -1) 0 else idx])
                    }
                    in rule[2] -> {
                        idx = rule[2].indexOf(it) - 1
                        sb.append(rule[2][if (idx == -1) 0 else idx])
                    }
                    in rule[3] -> {
                        idx = rule[3].indexOf(it) - 1
                        sb.append(rule[3][if (idx == -1) 0 else idx])
                    }
                    else -> {
                        sb.append(" ")
                    }
                }
            }
            sb.append("\n")
        }

        bw.write(sb.toString())
        bw.flush()
    }

    bw.close()
}