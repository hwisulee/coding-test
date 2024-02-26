import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
    var result = ""
    var idx = 0
    while (idx < input.length) {
        if (input[idx] == '0') {
            if (idx + 1 >= input.length) { result = "NOISE"; break }
            if (input[idx + 1] != '1') { result = "NOISE"; break }
            idx += 2
        } else {
            if (idx + 3 >= input.length) { result = "NOISE"; break }
            if (input[idx + 1] != '0' || input[idx + 2] != '0') { result = "NOISE"; break }
            idx += 3

            while (idx < input.length && input[idx] == '0') idx++
            if (idx >= input.length) { result = "NOISE"; break }
            idx++

            while (idx < input.length && input[idx] == '1') {
                if (idx + 2 < input.length && input[idx + 1] == '0' && input[idx + 2] == '0') break
                idx++
            }
        }

        result = "SUBMARINE"
    }

    bw.write(result)
    bw.flush()
    bw.close()
}