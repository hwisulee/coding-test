import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val subject = IntArray(br.readLine().toInt()) { 0 }
    val scores = br.readLine().split(" ").map { it.toDouble() }

    bw.write("${scores.map { it / scores.max() * 100 }.average()}")
    bw.flush()
    bw.close()
}