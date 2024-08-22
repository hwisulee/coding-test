import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    bw.write("${str.trimEnd('0').count { it == '0' }}")
    bw.flush()
    bw.close()
}