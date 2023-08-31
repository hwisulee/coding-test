import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var arr = intArrayOf()
    repeat(7) { arr += br.readLine().toInt() }
    arr.filter { it % 2 == 1 }.also {
        if (it.isNotEmpty()) {
            bw.appendLine("${it.sumOf { it }}")
            bw.appendLine("${it.minOf { it }}")
        } else {
            bw.appendLine("-1")
        }
    }
    bw.flush()
    bw.close()
}