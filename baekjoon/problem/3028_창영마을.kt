import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = MutableList(3) { false }.also { it[0] = true }
    readLine().onEach {
        when (it) {
            'A' -> Collections.swap(arr, 0, 1)
            'B' -> Collections.swap(arr, 1, 2)
            'C' -> Collections.swap(arr, 2, 0)
        }
    }

    bw.write("${arr.indexOf(true) + 1}")
    bw.flush()
    bw.close()
}