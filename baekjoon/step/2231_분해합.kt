import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var arr = emptyArray<Int>()

    for (i in n - 1 downTo 1) {
        val temp = i + i.toString().chunked(1).sumOf { it.toInt() }

        if (temp == n) arr += i
    }

    try {
        bw.write("${arr.min()}")
    } catch (_: Exception) {
        bw.write("0")
    }
    bw.flush()
    bw.close()
}