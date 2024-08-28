import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val words = Array<String>(readLine().toInt()) { readLine() }
        .groupingBy { it }
        .eachCount()
        .maxBy { it.key }
    
    bw.write("${words.key} ${words.value}")
    bw.flush()
    bw.close()
}