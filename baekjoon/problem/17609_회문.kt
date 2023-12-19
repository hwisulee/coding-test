import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val s = readLine()
        if (s == s.reversed()) bw.appendLine("0")
        else {
            for (i in 0 until s.length / 2) {
                if (s[i] != s[s.length - 1 - i]) {
                    val temp1 = s.substring(i + 1, s.length - i)
                    val temp2 = s.substring(i, s.length - i - 1)
                    if (temp1 == temp1.reversed() || temp2 == temp2.reversed()) bw.appendLine("1") else bw.appendLine("2")
                    break
                }
            }
        }
    }
    bw.flush()
    bw.close()
}