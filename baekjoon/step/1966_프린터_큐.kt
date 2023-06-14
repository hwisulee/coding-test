import java.io.*
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val queue: Queue<IntArray> = LinkedList()
        val (n, m) = br.readLine().split(" ").map { it.toInt() }
        val st = StringTokenizer(br.readLine())
        repeat(n) {
            queue.add(intArrayOf(it, st.nextToken().toInt()))
        }

        var cnt = 0
        while (true) {
            if (queue.peek()[1] == queue.maxOf { it[1] }) {
                cnt++
                if (queue.remove()[0] == m) break
            } else {
                queue.add(queue.remove())
            }
        }
        bw.appendLine("$cnt")
    }
    bw.flush()
    bw.close()
}