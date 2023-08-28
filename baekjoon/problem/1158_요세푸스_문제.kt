import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val queue: Queue<Int> = LinkedList()
    val sb = StringBuilder()
    repeat(n) { queue.add(it + 1) }

    sb.append("<")
    while (queue.isNotEmpty()) {
        var temp = 0
        while (queue.isNotEmpty() && temp < k - 1) {
            queue.add(queue.poll())
            temp++
        }

        sb.append("${queue.poll()}")
        if (queue.isNotEmpty()) sb.append(", ")
    }
    sb.append(">")

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}