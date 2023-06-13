import java.io.*
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val t = br.readLine().toInt()
    repeat(t) {
        val stack = Stack<Char>()
        val input = br.readLine()

        input.forEach {
            if (stack.isNotEmpty() && it == ')') stack.pop()
            else if (stack.isEmpty() && it == ')') {
                bw.appendLine("NO")
                return@repeat
            }
            else stack.push('(')
        }

        if (stack.isEmpty()) bw.appendLine("YES")
        else bw.appendLine("NO")
    }
    bw.flush()
    bw.close()
}