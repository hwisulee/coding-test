import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val dq = ArrayDeque<Int>()
    repeat(br.readLine().toInt()) {
        br.readLine().also {
            when (it) {
                "size" -> {
                    bw.appendLine("${dq.size}")
                }
                "empty" -> {
                    if (dq.isEmpty()) bw.appendLine("1")
                    else bw.appendLine("0")
                }
                "pop_front" -> {
                    if (dq.size == 0) bw.appendLine("-1") else bw.appendLine("${dq.removeFirst()}")
                }
                "pop_back" -> {
                    if (dq.size == 0) bw.appendLine("-1") else bw.appendLine("${dq.removeLast()}")
                }
                "front" -> {
                    if (dq.size == 0) bw.appendLine("-1") else bw.appendLine("${dq.first()}")
                }
                "back" -> {
                    if (dq.size == 0) bw.appendLine("-1") else bw.appendLine("${dq.last()}")
                }
                else -> {
                    val (a, b) = it.split(" ")

                    if (a == "push_front") {
                        dq.addFirst(b.toInt())
                    } else {
                        dq.addLast(b.toInt())
                    }
                }
            }
        }
    }
    bw.flush()
    bw.close()
}