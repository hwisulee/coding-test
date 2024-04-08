import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

lateinit var arr: IntArray
lateinit var stack: Stack<Char>
val strList = mutableListOf<String>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        arr = IntArray(26) { 0 }
        val input = readLine().toCharArray().onEach {
            arr[it - 'a']++
        }
        stack = Stack<Char>()
        permutation(input.size)
    }

    strList.forEach { bw.appendLine(it) }
    bw.flush()
    bw.close()
}

fun permutation(length: Int) {
    if (length == stack.size) {
        strList += stack.joinToString("")
    }

    for (i in 0 until 26) {
        if (arr[i] > 0) {
            arr[i]--
            stack.push((i + 'a'.code).toChar())
            permutation(length)
            stack.pop()
            arr[i]++
        }
    }
}