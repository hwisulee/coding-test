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

        bw.appendLine("${quickSum(input)}")
        bw.flush()
    }

    bw.close()
}

fun quickSum(str: String): Int {
    var sum = 0
    str.forEachIndexed { index, c ->
        if (c != ' ') sum += (index + 1) * (c.code - 64)
    }

    return sum
}