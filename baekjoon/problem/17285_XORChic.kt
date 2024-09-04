import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine()
    val key = t[0].code xor 'C'.code
    val original = t.map { (it.code xor key).toChar() }.joinToString("")

    bw.write(original)
    bw.flush()
    bw.close()
}