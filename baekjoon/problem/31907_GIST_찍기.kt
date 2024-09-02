import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val k = readLine().toInt()
    val gist = arrayOf("G...", ".I.T", "..S.")
    gist.forEachIndexed { i, s ->
        repeat(k) {
            bw.appendLine(gist[i].map { "$it".repeat(k) }.joinToString(""))
        }
    }

    bw.flush()
    bw.close()
}