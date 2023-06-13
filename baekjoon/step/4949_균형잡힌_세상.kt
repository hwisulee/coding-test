import java.io.*
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val stack = Stack<Char>()
        val input = br.readLine()

        if (input == ".") break

        try {
            input.forEach {
                when (it) {
                    '(' -> stack.push('(')
                    '[' -> stack.push('[')
                    ')' -> {
                        if (stack.peek() == '(') stack.pop()
                        else throw Exception()
                    }
                    ']' -> {
                        if (stack.peek() == '[') stack.pop()
                        else throw Exception()
                    }
                }
            }
            
            if (stack.isEmpty()) bw.appendLine("yes")
            else bw.appendLine("no")
        } catch (_: Exception) {
            bw.appendLine("no")
        }
    }
    bw.flush()
    bw.close()
}