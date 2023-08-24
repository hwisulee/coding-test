import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int> { o1, o2 -> if (abs(o1) == abs(o2)) o1 - o2 else abs(o1) - abs(o2) }
    repeat(n) {
        br.readLine().also {
            val temp = it.toInt()
            when (temp) {
                0 -> {
                    if (pq.isNotEmpty()) { bw.appendLine("${pq.poll()}") } else { bw.appendLine("0") }
                }
                else -> {
                    pq.offer(temp)
                }
            }
        }
    }
    bw.flush()
    bw.close()
}