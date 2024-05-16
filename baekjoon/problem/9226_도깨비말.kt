import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val queue: Queue<Char> = LinkedList()
        val input = readLine().onEach { queue.add(it) }
        var result = ""
        if (queue.peek() == '#') break

        for (i in queue.indices) {
            when (queue.peek()) {
                 'a', 'e', 'i', 'o', 'u' -> {
                     result = "${queue.joinToString("")}ay"
                     break
                }
                else -> {
                    queue.add(queue.poll())
                }
            }
        }

        bw.appendLine(result.ifBlank { "${input}ay" })
        bw.flush()
    }

    bw.close()
}