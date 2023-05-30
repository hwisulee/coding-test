import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val n = br.readLine().toInt()
        var arr = emptyArray<Int>()

        if (n == -1) break

        for (i in 1 .. n) {
            if (n % i == 0) arr += i
        }

        if (arr.filter { it != n }.sum() == n) {
            bw.write("$n = " + arr.filter { it != n }.joinToString(" + ") + "\n")
        } else {
            bw.write("$n is NOT perfect.\n")
        }
    }

    bw.flush()
    bw.close()
}