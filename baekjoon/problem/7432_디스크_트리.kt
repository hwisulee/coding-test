import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val trie = Trie()
    for (i in 0 until n) {
        trie.insert(readLine())
    }

    trie.print(0, bw)
    bw.flush()
    bw.close()
}

class Trie(private val root: TrieNode = TrieNode()) {
    fun insert(key: String) {
        var cur = root
        val address = key.split("\\")

        for (f in address) {
            cur.childNode.putIfAbsent(f, TrieNode())
            cur = cur.childNode[f]!!
        }
    }

    fun print(depth: Int, bw: BufferedWriter) {
        printing(root, depth, bw)
    }

    private fun printing(cur: TrieNode?, depth: Int, bw: BufferedWriter) {
        ArrayList(cur!!.childNode.keys).sorted().forEach {
            bw.append(" ".repeat(depth)).appendLine(it)
            printing(cur.childNode[it], depth + 1, bw)
        }
    }
}

class TrieNode {
    val childNode: MutableMap<String, TrieNode> = hashMapOf()
}