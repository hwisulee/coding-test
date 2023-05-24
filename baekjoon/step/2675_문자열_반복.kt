import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1 .. br.readLine().toInt()) {
        val (r, p) = br.readLine().split(" ")
        bw.write(p.indices.joinToString("") { p[it].toString().repeat(r.toInt()) } + "\n")
    }

    bw.flush()
    bw.close()
}