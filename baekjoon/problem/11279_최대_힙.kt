import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>(Collections.reverseOrder())
    repeat(n) {
        br.readLine().toInt().also { i ->
            when (i) {
                0 -> if (pq.isEmpty()) bw.appendLine("0") else bw.appendLine("${pq.poll()}")
                else -> pq.offer(i)
            }
        }
    }
    bw.flush()
    bw.close()
}