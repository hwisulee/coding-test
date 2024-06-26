import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

val data = HashMap<Char, Int>().apply {
    put('A', 0)
    put('G', 1)
    put('T', 2)
    put('C', 3)
}

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    val sb = StringBuilder()
    repeat(t) {
        val (n, m) = readLine().split(" ").map { it.toInt() }
        val first = readLine()
        val second = readLine()

        val trie = Trie()
        trie.insert(second)
        for (i in 0 until m) {
            for (j in i + 1 until m) {
                trie.insert(reverseProcess(second, i, j + 1))
            }
        }

        trie.failure()
        sb.appendLine(trie.find(first))
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}

fun reverseProcess(str: String, start: Int, end: Int): String {
    val sb = StringBuilder().apply {
        append(str.substring(0, start))
        append(StringBuilder(str.substring(start, end)).reverse())
        append(str.substring(end, str.length))
    }

    return sb.toString()
}

class Trie(private val root: TrieNode = TrieNode()) {
    fun insert(key: String) {
        var cur = root

        for (i in key.indices) {
            cur = cur.children.computeIfAbsent(data[key[i]]!!) { TrieNode() }
        }
        cur.isFinish = true
    }

    fun failure() {
        val queue: Queue<TrieNode> = LinkedList()
        root.failed = root
        queue.add(root)

        while (!queue.isEmpty()) {
            val cur = queue.poll()

            for (c in data.keys) {
                val key = data[c]
                val childNode = cur.children[key] ?: continue

                if (cur == root) {
                    childNode.failed = root
                } else {
                    var failure = cur.failed

                    while (failure!! != root && failure.children[key] == null) {
                        failure = failure.failed
                    }

                    if (failure.children[key] != null) failure = failure.children[key]
                    childNode.failed = failure
                }

                if (childNode.failed!!.isFinish) childNode.isFinish = true
                queue.add(childNode)
            }
        }
    }

    fun find(key: String): Int {
        var cur = root
        var cnt = 0

        for (i in key.indices) {
            val temp = data[key[i]]

            while (cur != root && cur.children[temp] == null) {
                cur = cur.failed!!
            }

            if (cur.children[temp] != null) cur = cur.children[temp]!!
            if (cur.isFinish) cnt++
        }

        return cnt
    }
}

class TrieNode {
    val children = HashMap<Int, TrieNode>()
    var failed: TrieNode? = null
    var isFinish = false
}