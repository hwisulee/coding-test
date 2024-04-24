import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine().replace("[0-9]".toRegex(), "")
    val k = readLine()

    bw.write(if (kmp(s, k)) "1" else "0")
    bw.flush()
    bw.close()
}

fun kmp(parent: String, pattern: String): Boolean {
    val table = makeTable(pattern)
    var check = false
    var idx = 0

    for (i in parent.indices) {
        while (idx > 0 && parent[i] != pattern[idx]) idx = table[idx - 1]
        if (parent[i] == pattern[idx]) {
            if (idx == pattern.length - 1) {
                check = true
                idx = table[idx]
            } else {
                idx++
            }
        }
    }

    return check
}

fun makeTable(pattern: String): IntArray {
    val table = IntArray(pattern.length) { 0 }
    var idx = 0

    for (i in 1 until table.size) {
        while (idx > 0 && pattern[i] != pattern[idx]) idx = table[idx - 1]
        if (pattern[i] == pattern[idx]) table[i] = ++idx
    }

    return table
}