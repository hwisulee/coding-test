import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b, v) = br.readLine().split(" ").map { it.toInt() }

    if ((v - a) % (a - b) == 0) bw.write("${(v - a) / (a - b) + 1}") else bw.write("${(v - a) / (a - b) + 2}")

    bw.flush()
    bw.close()
}