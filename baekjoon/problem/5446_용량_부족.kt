import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val trie = Trie()

        val n1 = readLine().toInt()
        repeat(n1) {
            val cur = readLine()
            trie.insert(cur, false)
        }

        val n2 = readLine().toInt()
        repeat(n2) {
            val cur = readLine()
            trie.insert(cur, true)
        }

        bw.write(if (n2 > 0) "${trie.find()}\n" else "1\n")
    }

    bw.flush()
    bw.close()
}

class TrieNode {
    val children = mutableMapOf<Char, TrieNode>()
    var doNotDelete = false
    var doDelete = false
    var doDeleteEnd = false
}

class Trie(private val root: TrieNode = TrieNode()) {
    fun insert(s: String, flag: Boolean) {
        var cur = root

        for (i in s.indices) {
            val c = s[i]
            if (!cur.children.containsKey(c)) cur.children[c] = TrieNode()

            cur = cur.children[c]!!

            if (flag) cur.doNotDelete = true else cur.doDelete = true
            if (!flag && i == s.length - 1) cur.doDeleteEnd = true
        }
    }

    fun find(): Int {
        return find(root)
    }

    private fun find(node: TrieNode): Int {
        var cmds = 0
        for ((_, cur) in node.children) {
            if (cur.doDelete) {
                if (!cur.doNotDelete) cmds++
                if (cur.doDeleteEnd && cur.doNotDelete) cmds++
                if (cur.doNotDelete) cmds += find(cur)
            }
        }

        return cmds
    }
}