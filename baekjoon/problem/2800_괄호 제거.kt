
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

var result = TreeSet<String>()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
    val stack = Stack<Int>()
    val arr = ArrayList<Pair<Int, Int>>()
    input.forEachIndexed { index, c ->
        when (c) {
            '(' -> stack.push(index)
            ')' -> arr += Pair(stack.pop(), index)
        }
    }
    combination(0, arr.size, input, arrayListOf(), arr)

    val sb = StringBuilder()
    result.forEachIndexed { index, s ->
        if (index != 0) sb.appendLine(s)
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun combination(idx: Int, depth: Int, input: String, cur: ArrayList<Int>, arr: ArrayList<Pair<Int, Int>>) {
    if (idx == depth) {
        return
    } else {
        result += addList(input, cur)
        combination(idx + 1, depth, input, cur, arr)
        cur += arr[idx].first
        cur += arr[idx].second

        result += addList(input, cur)
        combination(idx +1, depth, input, cur, arr)
        cur.removeLast()
        cur.removeLast()
    }
}

fun addList(input: String, cur: List<Int>): String {
    val sb = StringBuilder()
    repeat(input.length) {
        if (it !in cur) sb.append(input[it])
    }

    return sb.toString()
}