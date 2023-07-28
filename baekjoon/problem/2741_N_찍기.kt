import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    repeat(br.readLine().toInt()) { sb.appendLine(it + 1) }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}