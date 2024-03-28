import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (s, n) = readLine().split(" ").map { it.toInt() }
    val lcd = Array(25) { Array(n.toString().length * (s + 3)) { " " } }
    var row = 0

    for (i in n.toString()) {
        var column = 0
        val num = numLine(i.toString())
        
        // 지금부터 시행되는 if문-비교구문은 공통적으로 numLine()에서 항상 모든 숫자에서 " "이 아닌 부분에 해당한다.
        if (num[0][1] == "-") {
            for (j in row + 1 until row + 1 + s) {
                lcd[column][j] = "-"
            }
        }
        if (num[1][0] == "|") {
            for (j in 1 until 1 + s) {
                lcd[j][row] = "|"
            }
        }
        if (num[1][2] == "|") {
            for (j in 1 until 1 + s) {
                lcd[j][row + s + 1] = "|"
            }
        }
        if (num[2][1] == "-") {
            for (j in row + 1 until row + 1 + s) {
                lcd[1 + s][j] = "-"
            }
        }
        column += 1 + s

        if (num[3][0] == "|") {
            for (j in column + 1 until column + 1 + s) {
                lcd[j][row] = "|"
            }
        }
        if (num[3][2] == "|") {
            for (j in column + 1 until column + 1 + s) {
                lcd[j][row + s + 1] = "|"
            }
        }
        if (num[4][1] == "-") {
            for (j in row + 1 until row + 1 + s) {
                lcd[column + 1 + s][j] = "-"
            }
        }
        row += s + 3
    }

    for (i in 0 until 2 * s + 3) {
        for (j in 0 until row) {
            bw.write(lcd[i][j])
        }
        bw.appendLine()
    }

    bw.flush()
    bw.close()
}

fun numLine(num: String): Array<Array<String>> {
    return when (num) {
        "0" -> arrayOf(arrayOf(" ", "-", " "), arrayOf("|", " ", "|"), arrayOf(" ", " ", " "), arrayOf("|", " ", "|"), arrayOf(" ", "-", " "))
        "1" -> arrayOf(arrayOf(" ", " ", " "), arrayOf(" ", " ", "|"), arrayOf(" ", " ", " "), arrayOf(" ", " ", "|"), arrayOf(" ", " ", " "))
        "2" -> arrayOf(arrayOf(" ", "-", " "), arrayOf(" ", " ", "|"), arrayOf(" ", "-", " "), arrayOf("|", " ", " "), arrayOf(" ", "-", " "))
        "3" -> arrayOf(arrayOf(" ", "-", " "), arrayOf(" ", " ", "|"), arrayOf(" ", "-", " "), arrayOf(" ", " ", "|"), arrayOf(" ", "-", " "))
        "4" -> arrayOf(arrayOf(" ", " ", " "), arrayOf("|", " ", "|"), arrayOf(" ", "-", " "), arrayOf(" ", " ", "|"), arrayOf(" ", " ", " "))
        "5" -> arrayOf(arrayOf(" ", "-", " "), arrayOf("|", " ", " "), arrayOf(" ", "-", " "), arrayOf(" ", " ", "|"), arrayOf(" ", "-", " "))
        "6" -> arrayOf(arrayOf(" ", "-", " "), arrayOf("|", " ", " "), arrayOf(" ", "-", " "), arrayOf("|", " ", "|"), arrayOf(" ", "-", " "))
        "7" -> arrayOf(arrayOf(" ", "-", " "), arrayOf(" ", " ", "|"), arrayOf(" ", " ", " "), arrayOf(" ", " ", "|"), arrayOf(" ", " ", " "))
        "8" -> arrayOf(arrayOf(" ", "-", " "), arrayOf("|", " ", "|"), arrayOf(" ", "-", " "), arrayOf("|", " ", "|"), arrayOf(" ", "-", " "))
        else -> arrayOf(arrayOf(" ", "-", " "), arrayOf("|", " ", "|"), arrayOf(" ", "-", " "), arrayOf(" ", " ", "|"), arrayOf(" ", "-", " "))
    }
}