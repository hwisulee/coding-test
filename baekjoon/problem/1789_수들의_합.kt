import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine().toLong()
    var num = 1L
    var sum = 0L
    var result = 0L

    while (true) {
        sum += num
        result++

        if (sum > s) { result--; break }
        num++
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}