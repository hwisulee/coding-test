import java.io.*
import java.util.LinkedList
import java.util.Queue

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val queue: Queue<Int> = LinkedList()
    val n = br.readLine().toInt()
    repeat(n) {
        br.readLine().also {
            when (it) {
                "pop", "front", "back" -> {
                    try {
                        if (it == "pop") bw.appendLine("${queue.remove()}")
                        if (it == "front") bw.appendLine("${queue.element()}")
                        if (it == "back") bw.appendLine("${queue.last()}")
                    } catch (_: Exception) {
                        bw.appendLine("-1")
                    }
                }
                "size" -> {
                    bw.appendLine("${queue.size}")
                }
                "empty" -> {
                    if (queue.isEmpty()) bw.appendLine("1")
                    else bw.appendLine("0")
                }
                else -> {
                    val (_, x) = it.split(" ")
                    queue.add(x.toInt())
                }
            }
        }
    }
    bw.flush()
    bw.close()
}