import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1 .. br.readLine().toInt()) {
        val sum = br.readLine().split(" ")
        bw.write("Case #$i: ${sum[0]} + ${sum[1]} = ${sum.sumOf { it.toInt() }}\n")
    }

    bw.flush()
    bw.close()
}