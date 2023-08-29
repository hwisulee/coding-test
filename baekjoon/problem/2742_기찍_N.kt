import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val st = StringBuilder()
    (1 .. n).map { it }.reversed().forEach { st.appendLine("$it") }
    bw.write(st.toString())
    bw.flush()
    bw.close()
}