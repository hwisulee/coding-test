import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 1 .. n) {
        for (j in n downTo 1) {
            bw.write(if (i >= j) "*" else " ")
        }
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}