import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val n = readLine().toInt()
        val card = readLine().split(" ")
        val deque = LinkedList<String>()
        for (i in card.indices) {
            if (deque.isEmpty()) {
                deque += card[i]
            } else {
                if (deque.first >= card[i]) deque.addFirst(card[i]) else deque.addLast(card[i])
            }
        }

        bw.appendLine(deque.joinToString(""))
    }
    bw.flush()
    bw.close()
}