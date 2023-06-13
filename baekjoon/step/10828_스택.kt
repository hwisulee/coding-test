import java.io.*
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stack = Stack<Int>()
    val n = br.readLine().toInt()
    repeat(n) {
        br.readLine().also {
            when (it) {
                "pop", "top" -> {
                    try {
                        if (it == "top") bw.appendLine("${stack.lastElement()}")
                        if (it == "pop") bw.appendLine("${stack.pop()}")
                    } catch (_: Exception) {
                        bw.appendLine("-1")
                    }
                }
                "size" -> {
                    bw.appendLine("${stack.size}")
                }
                "empty" -> {
                    if (stack.isEmpty()) {
                        bw.appendLine("1")
                    } else {
                        bw.appendLine("0")
                    }
                }
                else -> {
                    val (_, x) = it.split(" ")
                    stack.push(x.toInt())
                }
            }
        }
        bw.flush()
    }
    bw.close()
}