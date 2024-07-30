import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var index = 1
    var line: String?
    while (true) {
        line = readLine()
        if (line == "Was it a cat I saw?") break

        val sb = StringBuilder()
        for (i in line.indices step index + 1) {
            sb.append(line[i])
        }

        bw.write("$sb\n")
        bw.flush()
        index++
    }

    bw.close()
}