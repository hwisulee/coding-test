import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val line = readLine().lowercase()
        if (line == "#") break

        bw.appendLine("${line.count { it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u' }}")
    }
    bw.flush()
    bw.close()
}