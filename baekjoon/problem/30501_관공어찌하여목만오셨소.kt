import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val names = Array(readLine().toInt()) { readLine() }.filter { it.contains("[sS]".toRegex()) }
    bw.write(names.joinToString(""))
    bw.flush()
    bw.close()
}