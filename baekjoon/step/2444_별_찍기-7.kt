import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 1 .. n) {
        for (j in 1 .. n - i) bw.write(" ")
        for (j in 1 until 2 * i) bw.write("*")
        bw.write("\n")
    }

    for (i in n - 1 downTo 1) {
        for (j in 1 .. n - i) bw.write(" ")
        for (j in 1 until 2 * i) bw.write("*")
        bw.write("\n")
    }

    bw.flush()
    bw.close()
}