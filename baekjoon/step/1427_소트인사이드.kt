import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine()
    bw.write(n.chunked(1).sortedDescending().joinToString(""))
    bw.flush()
    bw.close()
}