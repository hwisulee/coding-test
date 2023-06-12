import java.io.*
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val arr = IntArray(n) { br.readLine().toInt() }

    val freqMap = arr.toMutableList().groupingBy { it }.eachCount()
    val mapKey = freqMap.filter { it.value == freqMap.maxOf { it.value } }.keys.sorted()

    bw.appendLine("${arr.average().roundToInt()}")
        .appendLine("${arr.sortedArray()[arr.size / 2]}")
        .appendLine("${if (mapKey.size == 1) mapKey.first() else mapKey[1]}")
        .appendLine("${arr.max() - arr.min()}")
    bw.flush()
    bw.close()
}