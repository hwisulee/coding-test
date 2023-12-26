import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().let { it.chunked(it.length / 2) }
    val arr = IntArray(2) { 0 }
    repeat(n.size) { if (arr[it] == 0) arr[it] = n[it].chunked(1).sumOf { it.toInt() } }
    bw.write(if (arr[0] == arr[1]) "LUCKY" else "READY")
    bw.flush()
    bw.close()
}