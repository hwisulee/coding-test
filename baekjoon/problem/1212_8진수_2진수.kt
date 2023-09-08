import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val parser = arrayOf("000", "001", "010", "011", "100", "101", "110", "111")
    val n = readLine()
    val sb = StringBuilder()
    if (n == "0") bw.write("0")
    else for (i in n) sb.append(parser[i.digitToInt()])

    bw.write(sb.trimStart { it == '0' }.toString())
    bw.flush()
    bw.close()
}