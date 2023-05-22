import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1 .. br.readLine().toInt()) {
        for (j in 1 .. i) {
            bw.write("*")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}