import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toUInt()

    bw.write("${num * 4.toUInt()}")
    bw.flush()
    bw.close()
}