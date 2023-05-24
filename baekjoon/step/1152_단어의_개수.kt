import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${br.readLine().split(" ").count { it.isNotEmpty() }}")
    bw.flush()
    bw.close()
}