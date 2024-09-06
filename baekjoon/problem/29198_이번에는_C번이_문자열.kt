import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val list = MutableList(n) { readLine().toCharArray().sorted().joinToString("") }.sorted()

    val sb = StringBuilder()
    for (i in 0 until k) {
        sb.append(list[i])
    }
    
    bw.write(sb.toString().toCharArray().sorted().joinToString(""))
    bw.flush()
    bw.close()
}