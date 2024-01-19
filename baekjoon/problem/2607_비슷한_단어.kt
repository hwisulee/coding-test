import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val word = readLine()
    var result = 0
    repeat(n - 1) {
        var cnt = 0
        val input = readLine()
        val alphabet = IntArray(26) { 0 }

        for (i in word.indices) {
            alphabet[word[i] - 'A']++
        }

        for (i in input.indices) {
            if (alphabet[input[i] - 'A'] > 0) {
                cnt++
                alphabet[input[i] - 'A']--
            }
        }

        if (word.length == input.length && (word.length == cnt || input.length - 1 == cnt)) result++
        else if (word.length == input.length - 1 && input.length - 1 == cnt) result++
        else if (word.length == input.length + 1 && input.length == cnt) result++
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}