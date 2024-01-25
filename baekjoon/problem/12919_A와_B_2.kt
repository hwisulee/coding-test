import java.io.BufferedWriter
import java.io.OutputStreamWriter

var answer = 0

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bruteForce(readLine(), readLine())
    bw.write("$answer")
    bw.flush()
    bw.close()
}

fun bruteForce(s: String, t: String) {
    if (s.length != t.length) {
        if (t[0] == 'B') bruteForce(s, t.substring(1).reversed())
        if (t[t.lastIndex] == 'A') bruteForce(s, t.substring(0, t.lastIndex))
    }
    if (s == t) answer = 1;
}