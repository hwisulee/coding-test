import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sum = br.readLine().split(" ").map { it.toBigInteger() }.sumOf { it }

    bw.write("$sum")
    bw.flush()
    bw.close()
}