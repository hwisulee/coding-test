
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var idx = 0
    var result = false
    val input = readLine()

    while (idx < input.length) {
        if (input[idx] == 'p') {
            if (idx + 1 >= input.length) break
            if (input[idx + 1] == 'i') {
                if (idx + 2 < input.length) idx += 2 else { result = true; break }
            } else {
                break
            }
        }

        if (input[idx] == 'k') {
            if (idx + 1 >= input.length) break
            if (input[idx + 1] == 'a') {
                if (idx + 2 < input.length) idx += 2 else { result = true; break }
            } else {
                break
            }
        }

        if (input[idx] == 'c') {
            if (idx + 2 >= input.length) break
            if (input[idx + 1] == 'h' && input[idx + 2] == 'u') {
                if (idx + 3 < input.length) idx += 3 else { result = true; break }
            } else {
                break
            }
        }

        if (input[idx] != 'p' && input[idx] != 'k' && input[idx] != 'c') {
            break
        }
    }

    bw.write(if (result) "YES" else "NO")
    bw.flush()
    bw.close()
}