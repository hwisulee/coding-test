import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1 .. br.readLine().toInt()) {
        val string = br.readLine()
        bw.write("${string.first()}${string.last()}\n")
    }
    bw.flush()
    bw.close()
}