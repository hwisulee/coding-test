import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, b) = br.readLine().split(" ")

    bw.write(Integer.toUnsignedString(n.toInt(), b.toInt()).uppercase())
    bw.flush()
    bw.close()
}