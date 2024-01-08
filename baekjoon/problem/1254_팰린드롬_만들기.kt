import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    var length = str.length
    for (i in str.indices) {
        var start = i
        var end = str.length - 1
        while (start < end && str[start] == str[end]) { start++; end-- }
        if (start >= end) { length += i; break }
    }
    
    bw.write("$length")
    bw.flush()
    bw.close()
}