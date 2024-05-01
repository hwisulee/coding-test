import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    val (n, m) = readLine().split(" ").map { it.toInt() }
    repeat(n) {
        val input = readLine()
        if (input.count { it == 'O' } >= input.lastIndex) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}