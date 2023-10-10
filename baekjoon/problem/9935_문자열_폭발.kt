import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    val bomb = readLine()
    val stack = Stack<Char>()

    for (c in str) {
        stack.add(c)

        if (stack.size >= bomb.length) {
            var equal = true
            for (i in bomb.indices) {
                if (stack[stack.size - bomb.length + i] != bomb[i]) { equal = false; break }
            }

            if (equal) { repeat(bomb.length) { stack.pop() } }
        }
    }

    if (stack.isEmpty()) bw.write("FRULA") else bw.write(stack.joinToString(""))
    bw.flush()
    bw.close()
}