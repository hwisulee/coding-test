import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val sum = br.readLine().split(" ").sumOf { it.toInt() }

        if (sum == 0) break

        bw.write("$sum\n")
    }

    bw.flush()
    bw.close()
}