import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val groupCount = mutableMapOf<String, Int>()
    repeat(n) {
        val cows = readLine()!!.split(" ").sorted().joinToString(" ")
        groupCount[cows] = groupCount.getOrDefault(cows, 0) + 1
    }
    
    bw.write("${groupCount.values.maxOrNull() ?: 0}")
    bw.flush()
    bw.close()
}