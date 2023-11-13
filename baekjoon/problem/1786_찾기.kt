import java.io.BufferedWriter
import java.io.OutputStreamWriter

val list = mutableListOf<Int>()

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine()
    val p = readLine()

    bw.appendLine("${kmp(t, p)}")
    for (i in 0 until list.size) {
        bw.appendLine("${list[i]}")
    }
    bw.flush()
    bw.close()
}

fun kmp(t: String, p: String): Int {
    val pi = pi(p)
    var idx = 0
    var result = 0

    for (i in t.indices) {
        while (idx > 0 && t[i] != p[idx]) { idx = pi[idx - 1] }
        if (t[i] == p[idx]) {
            if (idx == p.length - 1) {
                list += i - p.length + 2
                idx = pi[idx]
                result++
            } else {
                idx++
            }
        }
    }

    return result
}

fun pi(p: String): IntArray {
    var idx = 0
    val arr = IntArray(p.length)

    for (i in 1 until p.length) {
        while (idx > 0 && p[i] != p[idx]) { idx = arr[idx - 1] }
        if (p[i] == p[idx]) arr[i] = ++idx
    }

    return arr
}