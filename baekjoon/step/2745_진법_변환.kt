import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, b) = br.readLine().split(" ")

    bw.write("${n.toInt(b.toInt())}")
    bw.flush()
    bw.close()
}