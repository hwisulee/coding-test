import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0

    val size = br.readLine()
    val n = br.readLine().split(" ").map { it.toInt() }

    for (i in n.indices) {
        var arr = emptyArray<Int>()

        for (j in 1 .. n[i]) {
            if (n[i] % j == 0) arr += n[i]
        }

        if (arr.size == 2) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}