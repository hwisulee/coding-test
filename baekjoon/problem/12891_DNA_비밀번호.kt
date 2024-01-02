import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (s, p) = readLine().split(" ").map { it.toInt() }
    val str = readLine()
    val limit = readLine().split(" ").map { it.toInt() }
    val arr = IntArray(4) { 0 }
    var result = 0
    var idx = p

    repeat(p) {
        when (str[it]) {
            'A' -> arr[0]++
            'C' -> arr[1]++
            'G' -> arr[2]++
            'T' -> arr[3]++
        }
    }
    if (counting(arr, limit)) result++

    while (s > idx) {
        when (str[idx]) {
            'A' -> arr[0]++
            'C' -> arr[1]++
            'G' -> arr[2]++
            'T' -> arr[3]++
        }

        when (str[idx - p]) {
            'A' -> arr[0]--
            'C' -> arr[1]--
            'G' -> arr[2]--
            'T' -> arr[3]--
        }

        if (counting(arr, limit)) result++
        idx++
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}

fun counting(arr: IntArray, limit: List<Int>): Boolean {
    for (i in 0 until 4) {
        if (arr[i] < limit[i]) return false
    }
    return true
}