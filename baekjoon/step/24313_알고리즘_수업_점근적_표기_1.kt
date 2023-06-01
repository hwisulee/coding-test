import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a1, a0) = br.readLine().split(" ").map { it.toInt() }
    val c = br.readLine().toInt()
    val n0 = br.readLine().toInt()

    if (a1 * n0 + a0 <= c * n0 && a1 <= c) bw.write("1") else bw.write("0")
    bw.flush()
    bw.close()
}