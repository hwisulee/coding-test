import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var result = 0
    repeat(n) {
        val remain = readLine().replace("D-", "").toInt()
        if (remain <= 90) result++
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}