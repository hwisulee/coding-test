import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var arr = arrayOf<String>()
    repeat(n) { arr += readLine() }

    val list = arr.groupingBy { it[0] }.eachCount().filter { it.value >= 5 }.keys.sorted().joinToString("")
    bw.write(list.ifEmpty { "PREDAJA" })
    bw.flush()
    bw.close()
}