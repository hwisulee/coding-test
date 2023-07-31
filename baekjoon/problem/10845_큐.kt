import java.io.*
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val queue: Queue<Int> = LinkedList()
    repeat(num) {
        val request = br.readLine()

        when (request) {
            "front", "back" -> {
                try {
                    if (request == "front") bw.appendLine("${queue.element()}")
                    if (request == "back") bw.appendLine("${queue.last()}")
                } catch (_: Exception) {
                    bw.appendLine("-1")
                }
            }
            "size" -> bw.appendLine("${queue.size}")
            "empty" -> bw.appendLine("${if (queue.isEmpty()) 1 else 0}")
            "pop" -> bw.appendLine("${if (queue.isNotEmpty()) queue.poll() else -1}")
            else -> if (request.contains("push")) queue.add(request.split(" ")[1].toInt())
        }

    }

    bw.flush()
    bw.close()
}