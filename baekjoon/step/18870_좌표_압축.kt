import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }
    val sortedArr = arr.distinct().sorted()

    for (i in 0 until n) {
        bw.write("${sortedArr.binarySearch(arr[i])} ")
    }
    bw.flush()
    bw.close()
}