import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val a = readLine()
    val b = readLine()

    var flips = 0
    var i = 0
    while (i < n) {
        when {
            a[i] != b[i] -> {
                flips++
                while (i < n && a[i] != b[i]) i++
            }
            else -> i++
        }
    }

    bw.write("$flips")
    bw.flush()
    bw.close()
}