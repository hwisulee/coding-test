import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val m = br.readLine().toInt()
    val n = br.readLine().toInt()

    val list = (m..n).map { it }
    var primeList = emptyArray<Int>()

    for (i in list.indices) {
        var temp = emptyArray<Int>()

        for (j in 1 .. list[i]) {
            if (list[i] % j == 0) temp += list[i]
        }

        if (temp.size == 2) primeList += temp[1]
    }

    if (primeList.isNotEmpty()) bw.write("${primeList.sum()}\n${primeList.min()}") else bw.write("-1")
    bw.flush()
    bw.close()
}