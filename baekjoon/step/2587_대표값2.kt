import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr = emptyArray<Int>()
    repeat(5) {
        arr += br.readLine().toInt()
    }

    bw.appendLine("${arr.average().toInt()}")
    bw.appendLine("${checkMedian(arr)}")
    bw.flush()
    bw.close()
}

fun checkMedian(arr: Array<Int>): Int {
    val sorted = arr.sorted()
    val size = arr.size

    return if (size % 2 != 0) {
        sorted[size / 2]
    } else {
        sorted[(size - 1) / 2] / 2
    }
}