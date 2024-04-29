import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = ""
    var input: String
    while (true) {
        input = readLine()
        if (input.isNullOrEmpty()) break

        when {
            input.contains("w") -> result = "chunbae"
            input.contains("b") -> result = "nabi"
            input.contains("g") -> result = "yeongcheol"
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}