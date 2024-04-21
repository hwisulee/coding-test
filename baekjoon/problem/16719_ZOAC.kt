import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val bw = BufferedWriter(OutputStreamWriter(System.out))

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {


    readLine().apply {
        nextPermutation(this, CharArray(length), 0, length)
    }

    bw.flush()
    bw.close()
}

fun nextPermutation(input: String, output: CharArray, start: Int, end: Int) {
    var minChar = 'Z' + 1
    var minIndex = -1

    for (i in start until end) {
        if (minChar > input[i]) {
            minChar = input[i]
            minIndex = i
        }
    }

    if (minIndex != -1) {
        output[minIndex] = minChar

        for (i in output.indices) {
            bw.write("${if (output[i].isLetter()) output[i] else ""}")
        }
        bw.appendLine()

        nextPermutation(input, output, minIndex + 1, end)
        nextPermutation(input, output, start, minIndex)
    }
}