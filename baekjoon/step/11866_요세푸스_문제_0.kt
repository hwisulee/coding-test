import java.io.*
import java.util.LinkedList
import java.util.Queue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val queue: Queue<Int> = LinkedList()
    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    repeat(n) {
        queue.add(it + 1)
    }

    bw.append("<")
    while (queue.isNotEmpty()) {
        for (i in 0 until k - 1) {
            queue.add(queue.remove())
        }

        if (queue.size == 1) bw.append("${queue.remove()}>")
        else bw.append("${queue.remove()}, ")
    }
    bw.flush()
    bw.close()
}