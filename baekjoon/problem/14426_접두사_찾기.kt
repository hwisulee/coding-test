import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    var cnt = 0

    val root = Trie()
    for (i in 0 until n) {
        root.insert(readLine())
    }

    for (i in 0 until m) {
        if (root.find(readLine())) cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}

class Trie(private val root: TrieNode = TrieNode()) {
    fun insert(key: String) {
        var cur = root

        for (c in key.toCharArray()) {
            cur.children.putIfAbsent(c, TrieNode())
            cur = cur.children[c]!!
        }

        cur.isFinish = true
    }

    fun find(key: String): Boolean {
        var cur = root

        for (c in key.toCharArray()) {
            if (!cur.children.containsKey(c)) return false
            cur = cur.children[c]!!
        }

        return true
    }
}

class TrieNode {
    val children = HashMap<Char, TrieNode>()
    var isFinish = false
}