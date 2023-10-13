import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine()
    var remain = n.length % 3
    val sb = StringBuilder()
    var temp = 0

    when (remain) {
        1 -> sb.append(n[0] - '0')
        2 -> {
            temp += (n[0] - '0') * 2
            temp += n[1] - '0'
            sb.append(temp)
        }
    }

    while (remain < n.length) {
        temp = 0
        temp += (n[remain] - '0') * 4
        temp += (n[remain + 1] - '0') * 2
        temp += n[remain + 2] - '0'
        sb.append(temp)
        remain += 3
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}