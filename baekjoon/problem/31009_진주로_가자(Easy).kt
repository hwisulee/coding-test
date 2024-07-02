import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map: MutableMap<String, Int> = mutableMapOf()
    repeat(readLine().toInt()) {
        val (destination, price) = readLine().split(" ")
        map[destination] = price.toInt()
    }

    bw.appendLine("${map["jinju"]}").append("${map.count { it.value > map["jinju"]!! }}")
    bw.flush()
    bw.close()
}