import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr = intArrayOf()
    while (true) {
        val temp = br.readLine().toInt()
        arr += temp

        if (arr.size == 3) break
    }

    val numCnt = arr.reduce { x, y -> x * y}.toString().groupingBy { it }.eachCount()
    for (i in 0 .. 9) {
        if (numCnt.containsKey(i.digitToChar())) {
            bw.appendLine("${numCnt[i.digitToChar()]}")
        } else {
            bw.appendLine("0")
        }
    }
    bw.flush()
    bw.close()
}