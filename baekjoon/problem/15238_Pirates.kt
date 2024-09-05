import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    readLine().groupingBy { it }.eachCount().maxBy { it.value }.toPair().let {
        bw.write("${it.first} ${it.second}")
    }
    bw.flush()
    bw.close()
}