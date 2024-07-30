import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val queue = LinkedList<String>()
    val order = LinkedList<Boolean>()
    repeat(n) {
        val cmd = readLine().split(" ")
        when (cmd[0]) {
            "1" -> {
                queue.addLast(cmd[1])
                order.add(true)
            }
            "2" -> {
                queue.addFirst(cmd[1])
                order.add(false)
            }
            "3" -> {
                try {
                    val cur = order.pollLast()
                    if (cur) queue.removeLast() else queue.removeFirst()
                } catch (_: NullPointerException) { }
            }
        }
    }

    bw.write(if (queue.isNotEmpty()) queue.joinToString("") else "0")
    bw.flush()
    bw.close()
}