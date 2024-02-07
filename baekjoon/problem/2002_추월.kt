import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    var result = 0
    val qIn: Queue<String> = LinkedList()
    val qOut: Queue<String> = LinkedList()
    
    repeat(n) { qIn.add(readLine()) }
    repeat(n) { qOut.add(readLine()) }
    
    while (qOut.isNotEmpty()) {
        val cur = qOut.poll()
        if (qIn.peek() != cur) {
            qIn.remove(cur)
            result++
        } else {
            qIn.poll()
        }
    }
    
    bw.write("$result")
    bw.flush()
    bw.close()
}