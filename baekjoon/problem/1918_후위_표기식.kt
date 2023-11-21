import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val stack = Stack<Char>()
    readLine().forEach {
        when {
            it.isLetter() -> sb.append(it)
            it == '(' -> stack.push(it)
            it == ')' -> {
                while (stack.isNotEmpty() && stack.peek() != '(') { sb.append(stack.pop()) }
                if (stack.isNotEmpty() && stack.peek() == '(') stack.pop()
            }
            else -> {
                when (it) {
                    '+', '-' -> while (stack.isNotEmpty() && stack.peek() != '(') { sb.append(stack.pop()) }
                    else -> while (stack.isNotEmpty() && stack.peek() != '(' && stack.peek() != '+' && stack.peek() != '-') { sb.append(stack.pop()) }
                }

                stack.push(it)
            }
        }
    }

    while (stack.isNotEmpty()) { sb.append(stack.pop()) }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}