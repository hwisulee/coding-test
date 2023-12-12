import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = arrayListOf<String>()
    var checker = false
    readLine().forEach {
        if (it == 'S') {
            arr += "*S"
        }
        if (it == 'L') {
            if (checker) {
                arr += "*LL"
                checker = false
            } else {
                checker = true
            }
        }
    }
    arr += "*"

    bw.write("${if (arr.size >= n) n else arr.size}")
    bw.flush()
    bw.close()
}