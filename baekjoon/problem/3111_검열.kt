import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.properties.Delegates

val left = Stack<Char>()
val right = Stack<Char>()
var start = 0
var end by Delegates.notNull<Int>()
var isRemove = false

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine()
    val t = readLine()
    end = t.length - 1

    val sb = searchAndDelete(a, t)
    
    while (true) {
        val idx = sb.indexOf(a)
        if (idx < 0) break
        sb.delete(idx, idx + a.length)
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun searchAndDelete(a: String, t: String): StringBuilder {
    while (start <= end) {
        if (!isRemove) {
            left.push(t[start++])
            if (left.size >= a.length && left.peek() == a[a.lastIndex]) {
                var temp = a.lastIndex
                var check = true
                for (j in left.lastIndex downTo left.size - a.length) {
                    if (left[j] != a[temp--]) {
                        check = false
                        break
                    }
                }

                if (check) {
                    isRemove = true
                    for (j in a.indices) {
                        left.pop()
                    }
                }
            }
        }

        if (isRemove && start <= end) {
            val aReverse = StringBuilder(a).reverse().toString()
            right.push(t[end--])
            if (right.size >= a.length && right.peek() == aReverse[a.lastIndex]) {
                var temp = a.lastIndex
                var check = true
                for (j in right.lastIndex downTo right.size - a.length) {
                    if (right[j] != aReverse[temp--]) {
                        check = false
                        break
                    }
                }

                if (check) {
                    isRemove = false
                    for (j in a.indices) {
                        right.pop()
                    }
                }
            }
        }
    }

    val leftSize = left.size
    for (i in 0 until leftSize) {
        right.push(left.pop())
    }

    val sb = StringBuilder()
    while (!right.isEmpty()) {
        sb.append(right.pop())
    }

    return sb
}