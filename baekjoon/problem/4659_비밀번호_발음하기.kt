import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val pattern = arrayOf("a", "e", "i", "o", "u")
    test@while (true) {
        val case = readLine()
        if (case == "end") break

        var subCheck1 = false
        for (i in pattern) {
            if (case.contains(i)) { subCheck1 = true; break }
        }
        if (!subCheck1) { pwQualityChecker(false, case, bw); continue@test }

        var subCheck2 = true
        val sb = StringBuilder()
        val countArr = IntArray(2) { 0 }
        for (c in case) {
            sb.append(c)
            if (sb.toString().length == 2) {
                sb.toString().also {
                    if (it[0] != 'e'  && it[0] != 'o' && it[0] == it[1]) subCheck2 = false
                }
                if (!subCheck2) break
                sb.clear()
                sb.append(c)
            }
            if (pattern.joinToString("").contains(c)) {
                if (countArr[1] != 0) countArr[1] = 0
                countArr[0]++
            } else {
                if (countArr[0] != 0) countArr[0] = 0
                countArr[1]++
            }
            if (countArr[0] == 3 || countArr[1] == 3) { subCheck2 = false; break }
        }
        if (!subCheck2) { pwQualityChecker(false, case, bw); continue@test }
        if (subCheck1 && subCheck2) { pwQualityChecker(true, case, bw); continue@test }
    }

    bw.flush()
    bw.close()
}

fun pwQualityChecker(switch: Boolean, pw: String, bw: BufferedWriter) {
    bw.appendLine(if (switch) "<$pw> is acceptable." else "<$pw> is not acceptable.")
}