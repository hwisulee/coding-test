import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val room = Array(n) { Array(n) { '.' } }
    val checkList = IntArray(2) { 0 }
    repeat(n) {
        readLine().onEachIndexed { index, c ->
            if (room[it][index] != c) room[it][index] = c
        }
    }

    for (i in 0 until n) {
        val size = IntArray(2) { 0 }
        val line = BooleanArray(2) { false }

        for (j in 0 until n) {
            if (!line[0]) {
                if (room[i][j] == '.') size[0]++
                if (room[i][j] == 'X' && size[0] != 0) size[0]--
                if (size[0] == 2) {
                    checkList[0]++
                    size[0] = 0
                    line[0] = true
                }
            } else {
                if (room[i][j] == 'X') line[0] = false
            }

            if (!line[1]) {
                if (room[j][i] == '.') size[1]++
                if (room[j][i] == 'X' && size[1] != 0) size[1]--
                if (size[1] == 2) {
                    checkList[1]++
                    size[1] = 0
                    line[1] = true
                }
            } else {
                if (room[j][i] == 'X') line[1] = false
            }
        }
    }

    bw.appendLine(checkList.joinToString(" "))
    bw.flush()
    bw.close()
}