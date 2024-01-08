import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val (s1, s2) = readLine().split(" ")
        if (s1.chunked(1).sorted().joinToString("") == s2.chunked(1).sorted().joinToString("")) bw.appendLine("Possible")
        else bw.appendLine("Impossible")
    }

    bw.flush()
    bw.close()
}