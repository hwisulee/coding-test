import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine().replace("[^C|P|U]".toRegex(), "")
    val pattern = "UCPC"
    var idx = 0
    for (i in str.indices) {
        if (str[i] == pattern[idx]) idx++
        if (idx == 4) break
    }

    bw.write(if (idx == 4) "I love UCPC" else "I hate UCPC")
    bw.flush()
    bw.close()
}