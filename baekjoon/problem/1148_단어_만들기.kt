import java.io.BufferedWriter
import java.io.OutputStreamWriter

const val MAX_WORD = 200000

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val words = ArrayList<IntArray>(MAX_WORD)

    while (true) {
        val word = readLine()
        if (word == "-") break

        val wordCnt = IntArray(26)
        for (c in word) wordCnt[c - 'A']++

        words.add(wordCnt)
    }

    val output = StringBuilder()
    while (true) {
        val puzzle = readLine()
        if (puzzle == "#") break

        val puzzles = IntArray(26)
        for (c in puzzle) puzzles[c - 'A']++

        val result = IntArray(26)
        var min = MAX_WORD + 1
        var max = 0

        for (word in words) {
            var isValid = true

            for (i in 0 until 26) {
                if (word[i] > puzzles[i]) {
                    isValid = false
                    break
                }
            }

            if (isValid) {
                for (i in 0 until 26) {
                    if (word[i] > 0) result[i]++
                }
            }
        }

        for (i in 0 until 26) {
            if (puzzles[i] > 0) {
                if (min > result[i]) min = result[i]
                if (max < result[i]) max = result[i]
            }
        }

        for (i in 0 until 26) {
            if (puzzles[i] > 0 && result[i] == min) {
                output.append('A' + i)
            }
        }
        output.append(" $min ")

        for (i in 0 until 26) {
            if (puzzles[i] > 0 && result[i] == max) {
                output.append('A' + i)
            }
        }
        output.append(" $max\n")
    }

    bw.write(output.toString())
    bw.flush()
    bw.close()
}