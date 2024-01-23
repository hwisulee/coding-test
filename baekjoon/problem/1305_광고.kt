import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val str = readLine()
    bw.write("${n - kmp(str)}")
    bw.flush()
    bw.close()
}

fun kmp(str: String): Int {
    var max = 0
    var cur = 0
    val arr = IntArray(str.length) { 0 }
    for (i in 1 until str.length) {
        while (cur > 0 && str[cur] != str[i]) cur = arr[cur - 1]
        if (str[cur] == str[i]) {
            arr[i] = ++cur
            max = Math.max(max, arr[i])
        }
    }

    return arr[str.length - 1]
}