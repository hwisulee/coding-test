
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


val trie = Trie()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        trie.insert(readLine())
    }
    trie.failure()

    val q = readLine().toInt()
    repeat(q) {
        bw.appendLine(if (trie.find(readLine())) "YES" else "NO")
    }
    bw.flush()
    bw.close()
}

class Trie(private val root: TrieNode = TrieNode()) {
    fun insert(key: String) {
        var cur = root

        for (i in key.indices) {
            val next = key[i]

            cur.children.putIfAbsent(next, TrieNode())
            cur = cur.children[next]!!
        }

        cur.isFinish = true
    }

    fun failure() { // KMP 비교 중 실패했을 때 이동할 지점 정의하는 함수
        val queue: Queue<TrieNode> = LinkedList()
        root.failed = root
        queue.add(root)

        while (queue.isNotEmpty()) {
            val currentNode = queue.poll()

            for (i in 0 until 26) {
                val next = (97 + i).toChar()
                val nextNode = currentNode.children[next] ?: continue

                if (currentNode == root) {
                    nextNode.failed = root
                } else {
                    var failure = currentNode.failed

                    while (failure!! != root && failure.children[next] == null) {
                        failure = failure.failed
                    }

                    if (failure.children[next] != null) failure = failure.children[next]
                    nextNode.failed = failure
                }

                if (nextNode.failed!!.isFinish) nextNode.isFinish = true
                queue.add(nextNode)
            }
        }
    }

    fun find(key: String): Boolean { // KMP
        var cur = root

        for (i in key.indices) {
            val next = key[i]

            while (cur != root && cur.children[next] == null) {
                cur = cur.failed!!
            }

            if (cur.children[next] != null) cur = cur.children[next]!!
            if (cur.isFinish) return true
        }

        return false
    }
}

class TrieNode {
    val children = HashMap<Char, TrieNode>()
    var failed: TrieNode? = null
    var isFinish = false
}