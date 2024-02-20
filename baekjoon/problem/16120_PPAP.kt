import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    val stack = Stack<Char>()
    var check = true
    for (i in str.indices) {
        val cur = str[i]
        if (cur == 'P') stack.push('P')
        else {
            if (stack.size >= 2 && i < str.length - 1 && str[i + 1] == 'P') {
                repeat(2) { stack.pop() }
            } else {
                check = false
                break
            }
        }
    }

    bw.write(if (stack.size == 1 && check) "PPAP" else "NP")
    bw.flush()
    bw.close()
}
