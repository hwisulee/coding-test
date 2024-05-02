import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = Array(3) { readLine() }
    bw.write("${arr[0].toInt() + arr[1].toInt() - arr[2].toInt()}\n${(arr[0] + arr[1]).toInt() - arr[2].toInt()}")
    bw.flush()
    bw.close()
}