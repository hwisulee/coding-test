import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val table = BooleanArray(26)
    "CAMBRIDGE".forEach { table[it.code - 65] = true }
    readLine().filter { !table[it.code - 65] }.forEach { bw.write("$it") }
    bw.flush()
    bw.close()
}