import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine()
    val b = readLine()
    val bb = b.repeat(2)

    var cnt = 0
    for (i in a.indices) {
        val temp = bb.substring(i, i + a.length)
        if (a == temp) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}