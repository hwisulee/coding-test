import java.io.*
import java.util.LinkedList
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()
    repeat(t) {
        val p = br.readLine()
        val n = br.readLine().toInt()
        val st = StringTokenizer(br.readLine().drop(1).dropLast(1), ",")
        val queue = LinkedList<Int>()
        var isReversed = false
        var error = 0

        repeat(n) { queue.addLast(st.nextToken().toInt()) }
        for (i in p) {
            when (i) {
                'R' -> isReversed = !isReversed
                'D' -> {
                    when {
                        queue.size < 1 -> {
                            error += 1
                            bw.appendLine("error")
                            break
                        }
                        else -> {
                            when {
                                !isReversed -> queue.removeFirst()
                                else -> queue.removeLast()
                            }
                        }
                    }
                }
            }
        }

        if (error == 0) {
            if (isReversed) queue.reverse()
            bw.appendLine(queue.toString().replace(", ",","))
        }
    }
    bw.flush()
    bw.close()
}