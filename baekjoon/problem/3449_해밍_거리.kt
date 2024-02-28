import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        var distance = 0
        val a = readLine()
        val b = readLine()
        for (i in a.indices) {
            if (a[i] != b[i]) distance++
        }

        bw.appendLine("Hamming distance is $distance.")
    }
    bw.flush()
    bw.close()
}
