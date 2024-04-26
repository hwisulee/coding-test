import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = Array<String>(readLine().toInt()) { readLine() }
    val m = readLine().toInt()
    var a = arrayOf<String>()
    repeat(m) {
        val input = readLine()
        if (!s.contains(input)) a += input
    }

    var result = ""
    for (i in s.indices) {
        if (s.size == 1) {
            result = a[0]
            break
        }
        
        if (s[i] == "?") {
            when (i) {
                0 -> result = a.filter { it.endsWith(s[i + 1][0]) }[0]
                s.lastIndex -> result = a.filter { it[0] == s[i - 1][s[i - 1].lastIndex] }[0]
                else -> {
                    val start = s[i - 1][s[i - 1].lastIndex]
                    val end = s[i + 1][0]
                    result = a.filter { it.startsWith(start) && it.endsWith(end) }[0]
                }
            }

            if (result != "") break
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}