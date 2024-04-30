import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val stack = Stack<Int>()
    readLine().forEach {
        when (it) {
            ')' -> {
                var num = 0
                while (true) {
                    if (stack.peek() == 0) {
                        stack.pop()
                        stack.push(num)
                        break
                    }

                    num += stack.pop()
                }
            }
            'H' -> stack.push(1)
            'C' -> stack.push(12)
            'O' -> stack.push(16)
            else -> if (it in '0' .. '9') stack.push(stack.pop() * (it - '0')) else stack.push(0)
        }
    }

    bw.write("${stack.sum()}")
    bw.flush()
    bw.close()
}