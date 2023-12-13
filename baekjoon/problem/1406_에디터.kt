import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    val list = LinkedList<String>()
    str.forEach { list += it.toString() }

    val iterator = list.listIterator(list.size)
    val m = readLine().toInt()
    repeat(m) {
        val command = readLine().split(" ")
        when (command[0]) {
            "L" -> if (iterator.hasPrevious()) iterator.previous()
            "D" -> if (iterator.hasNext()) iterator.next()
            "B" -> if (iterator.hasPrevious()) { iterator.previous(); iterator.remove() }
            "P" -> iterator.add(command[1])
        }
    }
    bw.write(list.joinToString(""))
    bw.flush()
    bw.close()
}