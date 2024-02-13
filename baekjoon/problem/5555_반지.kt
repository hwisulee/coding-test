import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    val n = readLine().toInt()
    var result = 0
    repeat(n) {
        val queue: Queue<Char> = LinkedList()
        readLine().forEach { queue.add(it) }
        for (i in queue.indices) {
            if (queue.joinToString("").regionMatches(0, str, 0, str.length)) {
                result++
                break
            } else {
                queue.add(queue.poll())
            }
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}