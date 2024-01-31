import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine()
    var result = "NO"
    for (i in 1 .. n.lastIndex) {
        val front = n.substring(0 until  i)
        val back = n.substring(i .. n.lastIndex)

        var frontCal = 1
        front.chunked(1).map { frontCal *= it.toInt() }

        var backCal = 1
        back.chunked(1).map { backCal *= it.toInt() }

        if (frontCal == backCal) result = "YES"
    }

    bw.write(result)
    bw.flush()
    bw.close()
}