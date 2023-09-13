import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n) { readLine().also { list += it } }

    val max = list.groupingBy { it }.eachCount().maxOf { it.value }
    
    bw.write(list.groupingBy { it }.eachCount().filterValues { it >= max }.map { it.key }.sorted()[0])
    bw.flush()
    bw.close()
}