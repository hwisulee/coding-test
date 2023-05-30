import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    var arr = emptyArray<Int>()

    for (i in 1 .. n) {
        if (n % i == 0) arr += i
    }

    if (arr.size < k) bw.write("0") else bw.write("${arr[k - 1]}")
    bw.flush()
    bw.close()
}