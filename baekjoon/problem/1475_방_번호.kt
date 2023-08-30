import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().chunked(1).map { it.toInt() }
    val arr = Array(10) { 0 }
    for (c in n) {
        if (c == 9) arr[6] += 1 else arr[c] += 1
    }

    arr[6] = if (arr[6] % 2 > 0) arr[6] / 2 + 1 else arr[6] / 2
    var max = 0
    for (i in arr) max = if (max < i) i else max

    bw.write(max.toString())
    bw.flush()
    bw.close()
}