import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val input = StringBuilder(readLine())
    val indexes = IntArray(2) { 0 }.also { it[1] = input.lastIndex }

    if (input.length % 2 != 0 && input[input.length / 2] == '?') input[input.length / 2] = 'a'
    for (i in 0 until input.length / 2) {
        val left = input[indexes[0]]
        val right = input[indexes[1]]

        when {
            left == '?' && right == '?' -> {
                input[indexes[0]] = 'a'.also { input[indexes[1]] = 'a' }
            }
            left == '?' || right == '?' -> {
                if (left == '?') input[indexes[0]] = right
                if (right == '?') input[indexes[1]] = left
            }
        }

        indexes[0]++.also { indexes[1]-- }
    }

    bw.write(input.toString())
    bw.flush()
    bw.close()
}