import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val pq = PriorityQueue<Int>()
    var result = 0
    repeat(n) { pq.add(br.readLine().toInt()) }

    while (pq.isNotEmpty()) {
        var temp = pq.poll()
        if (pq.isNotEmpty()) {
            temp += pq.poll()
            result += temp
            pq.add(temp)
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}