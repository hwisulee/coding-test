import java.io.*
import java.lang.StringBuilder
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val stack = Stack<Int>()
    val n = br.readLine().toInt()
    var cnt = 1
    repeat(n) {
        val num = br.readLine().toInt()

        while (cnt <= num) {
           stack.push(cnt)
           sb.appendLine("+")
           cnt += 1
        }

        if (num == stack.last()) {
            stack.pop()
            sb.appendLine("-")
        } else {
            println("NO")
            return
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}