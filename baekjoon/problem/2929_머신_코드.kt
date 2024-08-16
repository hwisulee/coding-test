import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val code = readLine()
    var nops = 0
    var currentPos = 0
    for (i in code.indices) {
        if (code[i].isUpperCase()) {
            if (currentPos % 4 != 0) {
                nops += 4 - (currentPos % 4)
                currentPos += 4 - (currentPos % 4)
            }
        }

        currentPos++
    }

    bw.write("$nops")
    bw.flush()
    bw.close()
}