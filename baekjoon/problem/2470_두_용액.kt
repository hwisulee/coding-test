import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = readLine().split(" ").map { it.toInt() }.sorted()

    var start = 0
    var end = n - 1
    var diff = Int.MAX_VALUE
    lateinit var answer: Pair<Int, Int>
    while (start < end) {
        val num = abs(list[start] + list[end])
        if (diff > num) {
            diff = num
            answer = Pair(list[start], list[end])
        }
        if (list[start] + list[end] > 0) end-- else start++
    }
    
    bw.write("${answer.first} ${answer.second}")
    bw.flush()
    bw.close()
}