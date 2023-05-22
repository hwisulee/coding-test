import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        try {
            val sum = br.readLine().split(" ").sumOf { it.toInt() }
            bw.write("$sum\n")
            bw.flush()
        } catch (_: Exception) {
            break
        }
    }

    bw.close()
}