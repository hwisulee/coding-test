import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    for (i in 1 .. br.readLine().toInt()) {
        val case = br.readLine().split(" ").map { it.toDouble() }
        val average = case.slice(1 .. case.lastIndex).average()
        val truth = case.slice(1..case.lastIndex).count { it > average } / case[0] * 100.0

        bw.write("${String.format("%.3f", truth)}%\n")
    }

    bw.flush()
    bw.close()
}