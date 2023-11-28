import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val v = readLine()
    val arr = readLine().chunked(1).groupingBy { it }.eachCount()
    bw.write(if (arr["A"] == arr["B"]) "Tie" else arr.maxBy { it.value }.key)
    bw.flush()
    bw.close()
}