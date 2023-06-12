import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }

    bw.write("${arr.min() * arr.max()}")
    bw.flush()
    bw.close()
}