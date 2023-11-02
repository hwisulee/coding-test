import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val m = readLine().toInt()
    val s = readLine()
    var answer = 0
    var cnt = 0

    for (i in 0 .. m - 3) {
        if (s[i] == 'I') {
            if (s[i + 1] == 'O' && s[i + 2] == 'I') {
                cnt++
                if (n <= cnt) answer++
            } else {
                cnt = 0
            }
        }
    }

    bw.write("$answer")
    bw.flush()
    bw.close()
}