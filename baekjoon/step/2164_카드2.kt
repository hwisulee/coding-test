import java.io.*
import java.util.LinkedList
import java.util.Queue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val queue: Queue<Int> = LinkedList()
    val n = br.readLine().toInt()
    repeat(n) {
        queue.add(it + 1)
    }

    while (true) {
        if (queue.size == 1) {
            bw.appendLine("${queue.element()}")
            break
        } else {
            queue.remove()
            queue.add(queue.element())
            queue.remove()
        }
    }
    bw.flush()
    bw.close()
}