import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val code = readLine()
    val list = Array(readLine().toInt()) { readLine() }
    bw.write("${list.count { it.slice(0 .. 4) == code.slice(0 .. 4) }}")
    bw.flush()
    bw.close()
}