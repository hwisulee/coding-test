import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Node(val child: MutableMap<Int, Node> = mutableMapOf(), var terminal: Boolean = false)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val trie = Trie()
        repeat(readLine().toInt()) {
            trie.add(readLine())
        }
        bw.appendLine(if (trie.unique) "YES" else "NO")
    }
    bw.flush()
    bw.close()
}

class Trie(val root: Node = Node(mutableMapOf(), false)) {
    var unique = true
    fun add(num: String) {
        var currentNode = root
        for (i in num) {
            if (currentNode.terminal) unique = false
            currentNode = currentNode.child.getOrPut(i.digitToInt()) { Node(mutableMapOf(), false) }
        }
        currentNode.terminal = true
        if (currentNode.terminal && currentNode.child.isNotEmpty()) unique = false
    }
}