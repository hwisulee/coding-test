import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m, k) = readLine().split(" ").map { it.toInt() }
    val arr = LongArray(n + 1) { if (it == 0) 0L else readLine().toLong() }
    val tree = SegmentTree(arr)

    tree.init(0, n, 1)

    repeat(m + k) {
        val input = StringTokenizer(readLine())
        val a = input.nextToken().toInt()
        val b = input.nextToken().toInt()

        when (a) {
            1 -> {
                val c = input.nextToken().toLong()
                val diff = c - arr[b]
                arr[b] = c
                tree.update(0, n, 1, b, diff)
            }
            2 -> {
                val c = input.nextToken().toInt()
                val result = tree.sum(0, n, 1, b, c).toString()
                bw.appendLine(result)
                bw.flush()
            }
        }
    }

    bw.close()
}

class SegmentTree(private val arr: LongArray) {
    private val tree = LongArray(arr.size * 4) { 0L }

    fun init(start: Int, end: Int, node: Int): Long {
        return if (start == end) {
            tree[node] = arr[start]
            tree[node]
        } else {
            val mid = (start + end) / 2
            tree[node] = init(start, mid, node * 2) + init(mid + 1, end, node * 2 + 1)
            tree[node]
        }
    }

    fun update(start: Int, end: Int, node: Int, index: Int, diff: Long) {
        if (index < start || index > end) return

        tree[node] += diff

        if (start != end) {
            val mid = (start + end) / 2
            update(start, mid, node * 2, index, diff)
            update(mid + 1, end, node * 2 + 1, index, diff)
        }
    }

    fun sum(start: Int, end: Int, node: Int, left: Int, right: Int): Long {
        return when {
            left > end || right < start -> 0
            left <= start && end <= right -> tree[node]
            else -> {
                val mid = (start + end) / 2
                sum(start, mid, node * 2, left, right) + sum(mid + 1, end, node * 2 + 1, left, right)
            }
        }
    }
}