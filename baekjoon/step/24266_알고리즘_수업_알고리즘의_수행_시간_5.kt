import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toLong()
    bw.appendLine("${n * n * n}")
    bw.appendLine("3")
    bw.flush()
    bw.close()
}