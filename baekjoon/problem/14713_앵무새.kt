import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val queue: Array<Queue<String>> = Array(n) { LinkedList() }
    repeat(n) { idx ->
        readLine().split(" ").forEach {
            queue[idx].add(it)
        }
    }

    val l: Queue<String> = LinkedList()
    readLine().split(" ").forEach {
        l.add(it)
    }


    while (l.isNotEmpty()) {
        val cur = l.poll()
        var isFound = false

        repeat(n) {
            if (cur.equals(queue[it].peek())) {
                queue[it].poll()
                isFound = true
            }
        }

        if (!isFound) exitProgram(false, bw)
    }

    repeat(n) {
        while (queue[it].isNotEmpty()) {
            exitProgram(false, bw)
        }
    }

    exitProgram(true, bw)
}

fun exitProgram(flag: Boolean, bw: BufferedWriter) {
    bw.write(if (flag) "Possible" else "Impossible")
    bw.flush()
    bw.close()
    exitProcess(0)
}