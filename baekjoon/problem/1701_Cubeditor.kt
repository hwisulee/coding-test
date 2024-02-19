import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var max = 0
    val input = readLine()
    for (i in input.indices) {
        val temp = input.substring(i, input.length)
        max = max.coerceAtLeast(kmp(temp))
    }

    bw.write("$max")
    bw.flush()
    bw.close()
}

fun kmp(temp: String): Int {
    var max = 0
    var cur = 0
    val arr = IntArray(temp.length) { 0 }
    for (i in 1 until temp.length) {
        while (cur > 0 && temp[cur] != temp[i]) cur = arr[cur - 1]
        if (temp[cur] == temp[i]) {
            arr[i] = ++cur
            max = max.coerceAtLeast(arr[i])
        }
    }

    return max
}