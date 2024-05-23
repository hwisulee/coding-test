import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (w, g) = readLine().split(" ").map { it.toInt() }
    val inputs = Array<String>(2) { readLine() }
    val arr = Array(2) { IntArray(52) }
    for (cur in inputs[0]) {
        arrInputChar(cur, arr[0], 1)
    }

    var start = 0
    var cnt = 0
    var size = 0
    for (i in inputs[1].indices) {
        val cur = inputs[1][i]
        arrInputChar(cur, arr[1], 1)
        size++

        if (size == inputs[0].length) {
            if (arr[0].contentEquals(arr[1])) cnt++
            arrInputChar(inputs[1][start], arr[1], -1)
            start++
            size--
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}

fun arrInputChar(cur: Char, arr: IntArray, dif: Int) {
    if (cur in 'a'..'z') arr[cur - 'a'] += dif else arr[cur - 'A' + 26] += dif
}