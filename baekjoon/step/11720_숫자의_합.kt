import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val length = br.readLine().toInt()
    val string = br.readLine().chunked(1).map { it.toInt() }

    if (string.size == length) bw.write("${string.sum()}")
    bw.flush()
    bw.close()
}