import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val m = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }.sorted()

    var result = 0
    var start = 0
    var end = arr.size - 1
    while (start < end) {
        val sum = arr[start] + arr[end]
        when {
            sum < m -> start++
            sum > m -> end--
            else -> {
                var tempStart = start
                var tempEnd = end

                while (tempStart < end && arr[start] == arr[tempStart]) tempStart++
                while (tempEnd > start && arr[end] == arr[tempEnd]) tempEnd--

                result += (tempStart - start) * (end - tempEnd)
                start = tempStart
                end = tempEnd
            }
        }
    }
    bw.write("${result}")
    bw.flush()
    bw.close()
}