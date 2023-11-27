import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = 0
    var temp = 1
    val deque = ArrayDeque<Char>()
    val str = readLine().toCharArray()
    for (i in str.indices) {
        when (str[i]) {
            '(' -> { deque.addLast('('); temp *= 2 }
            '[' -> { deque.addLast('['); temp *= 3 }
            ')' -> {
                if (deque.isEmpty() || deque[deque.lastIndex] != '(') { result = 0; break }
                if (str[i - 1] == '(') result += temp
                temp /= 2
                deque.removeLast()
            }
            ']' -> {
                if (deque.isEmpty() || deque[deque.lastIndex] != '[') { result = 0; break }
                if (str[i - 1] == '[') result += temp
                temp /= 3
                deque.removeLast()
            }
        }
    }

    if (!deque.isEmpty()) result = 0

    bw.write("$result")
    bw.flush()
    bw.close()
}