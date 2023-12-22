import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = 1000 - readLine().toInt()
    val coin = arrayOf(500, 100, 50, 10, 5, 1)
    var idx = 0
    var cnt = 0
    
    while (n > 0) {
        if (n >= coin[idx]) { n -= coin[idx]; cnt++ } else idx++
    }
    bw.write("$cnt")
    bw.flush()
    bw.close()
}