import java.io.*
import java.util.Stack

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val stack = Stack<Int>()
    val k = br.readLine().toInt()
    repeat(k) {
        br.readLine().also {
            when (it) {
                "0" -> stack.pop()
                else -> stack.push(it.toInt())
            }
        }
    }
    bw.write("${stack.sum()}")
    bw.flush()
    bw.close()
}