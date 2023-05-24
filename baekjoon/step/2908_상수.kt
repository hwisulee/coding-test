import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${br.readLine().split(" ").map { it.reversed().toInt() }.max()}")
    bw.flush()
    bw.close()
}