import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var line: String
    var str = arrayOf<String>()
    val sb = StringBuilder()

    try {
        while (readLine().also { line = it } != null) {
            val tokens = line
            if (tokens != "") str += tokens else break
        }
    } catch (_: Exception) {}

    for (i in str) {
        val arr = IntArray(4) { 0 }

        for (j in i) {
            if (j.isLowerCase()) arr[0]++
            if (j.isUpperCase()) arr[1]++
            if (j.isDigit()) arr[2]++
            if (j.isWhitespace()) arr[3]++
        }

        sb.appendLine(arr.joinToString(" "))
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}