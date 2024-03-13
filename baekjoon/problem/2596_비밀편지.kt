import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val s = readLine().toInt()
    val input = readLine().chunked(6)
    for (i in input.indices) {
        val temp = makeWord(input[i])
        if (temp in "A" .. "H") {
            sb.append(temp)
        } else {
            sb.clear().append("${i + 1}")
            break
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun makeWord(str: String): String {
    var code = ""
    var cnt = 0
    val list = arrayListOf("000000", "001111", "010011", "011100", "100110", "101001", "110101", "111010")

    for (i in list.indices) {
        var tempCnt = 6
        for (j in 0 until 6) {
            if (str[j] != list[i][j]) tempCnt--
        }

        if (tempCnt == 6) {
            code = list[i]
            break
        }

        if (tempCnt == 5) {
            if (cnt >= 1) return "0"
            code = list[i]
            cnt++
        }
    }

    return when (code) {
        "000000" -> "A"
        "001111" -> "B"
        "010011" -> "C"
        "011100" -> "D"
        "100110" -> "E"
        "101001" -> "F"
        "110101" -> "G"
        "111010" -> "H"
        else -> "0"
    }
}