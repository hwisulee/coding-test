import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.appendLine(br.readLine())
    bw.appendLine("1")
    bw.flush()
    bw.close()
}