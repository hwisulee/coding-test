import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1 .. br.readLine().toInt()) {
        val sum = br.readLine().split(" ").sumOf { it.toInt() }
        bw.write("Case #$i: $sum\n")
    }

    bw.flush()
    bw.close()
}