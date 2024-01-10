import java.io.BufferedWriter
import java.io.OutputStreamWriter

lateinit var table: IntArray

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    val p = readLine()
    makeTable(p)
    bw.write("${search(s, p)}")
    bw.flush()
    bw.close()
}

fun search(str: String, pattern: String): Int {
    var idx = 0
    for (i in str.indices) {
        while (idx > 0 && str[i] != pattern[idx]) idx = table[idx - 1]
        if (str[i] == pattern[idx]) {
            if (idx == pattern.length - 1) return 1 else idx++
        }
    }

    return 0
}

fun makeTable(pattern: String) {
    var idx = 0
    table = IntArray(pattern.length)
    for (i in 1 until pattern.length) {
        while (idx > 0 && pattern[i] != pattern[idx]) idx = table[idx - 1]
        if (pattern[i] == pattern[idx]) { idx++; table[i] = idx }
    }
}