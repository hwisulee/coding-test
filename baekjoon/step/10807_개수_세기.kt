import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val array = br.readLine().split(" ").map { it.toInt() }
    val v = br.readLine().toInt()

    bw.write("${array.count { it == v }}")
    bw.flush()
    bw.close()
}