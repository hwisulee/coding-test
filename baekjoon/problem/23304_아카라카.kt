import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var flag = true

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    flag = true
    palindrome(0, s.lastIndex, s)

    var idx = s.length / 2
    while (idx > 0 && flag) {
        palindrome(0, idx - 1, s)
        idx /= 2
    }

    bw.write(if (flag) "AKARAKA" else "IPSELENTI")
    bw.flush()
    bw.close()
}

fun palindrome(start: Int, end: Int, s: String) {
    if (start >= end) {
        flag = true
        return
    }
    if (s[start] == s[end]) {
        palindrome(start + 1, end - 1, s)
    } else {
        flag = false
    }
}