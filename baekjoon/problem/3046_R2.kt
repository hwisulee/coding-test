import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r1, s) = br.readLine().split(" ").map { it.toInt() }
    bw.write("${(s * 2) - r1}")
    bw.flush()
    bw.close()
}