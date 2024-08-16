import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (s, k) = readLine().split(" ")
    val pi = getPi(s)

    var result = s.length.toLong()
    for (i in 1 until k.toInt()) {
        result += s.length - pi[s.length - 1]
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}

fun getPi(s: String): IntArray {
    val pi = IntArray(s.length)
    var begin = 1
    var matched = 0

    while (begin + matched < s.length) {
        if (s[begin + matched] == s[matched]) {
            matched++
            pi[begin + matched - 1] = matched
        } else {
            if (matched == 0) {
                begin++
            } else {
                begin += matched - pi[matched - 1]
                matched = pi[matched - 1]
            }
        }
    }

    return pi
}