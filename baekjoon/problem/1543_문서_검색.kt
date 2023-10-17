import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val doc = readLine()
    val sample = readLine()
    var cnt = 0
    var index = 0
    while (index <= doc.length - sample.length) {
        var wIndex = 0
        while (wIndex < sample.length && sample[wIndex] == doc[index + wIndex]) wIndex++
        if (wIndex == sample.length) { cnt++; index += wIndex } else index++
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
}