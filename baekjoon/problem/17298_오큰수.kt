import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = readLine().split(" ").map { it.toInt() }.toMutableList()
    val stack = Stack<Int>()

    for (i in arr.indices) {
        while (stack.isNotEmpty() && arr[stack.peek()] < arr[i]) { arr[stack.pop()] = arr[i] }
        stack.push(i)
    }

    while (stack.isNotEmpty()) { arr[stack.pop()] = -1 }

    bw.write(arr.joinToString(" "))
    bw.flush()
    bw.close()
}