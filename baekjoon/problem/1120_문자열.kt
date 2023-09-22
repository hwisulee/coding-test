import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = readLine().split(" ")
    var result = a.length

    for (i in 0 .. (b.length - a.length)) {
        var temp = 0

        for (j in a.indices) { if (a[j] != b[j + i]) temp++ }
        if (result > temp) result = temp
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}