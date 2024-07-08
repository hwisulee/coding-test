import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

lateinit var numList: MutableList<Int>
lateinit var numCount: MutableList<Int>

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    numList = readLine().split(" ").map { it.toInt() }.toMutableList()
    numCount = MutableList(10) { 0 }

    bw.write("${twoPointer(0, 0, 0, 0, 0, n)}")
    bw.flush()
    bw.close()
}

fun twoPointer(low: Int, high: Int, count: Int, type: Int, max: Int, n: Int): Int {
    if (high >= n) return max

    val arr = IntArray(3).also {
        it[0] = low
        it[1] = count
        it[2] = type
    }

    if (numCount[numList[high]] == 0) arr[2]++
    arr[1]++
    numCount[numList[high]]++

    if (arr[2] > 2) {
        if (--numCount[numList[low]] == 0) arr[2]--
        arr[1]--
        arr[0]++
    }

    val nMax = max.coerceAtLeast(arr[1])
    return twoPointer(arr[0], high + 1, arr[1], arr[2], nMax, n)
}