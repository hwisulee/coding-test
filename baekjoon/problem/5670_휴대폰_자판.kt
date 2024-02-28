import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

data class Node(val child: HashMap<Char, Node>, var terminal: Boolean = false)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = readLine()
    while (n != null) {
        val trie = Trie()
        val num = n.toInt()
        val words = Array(num) { "" }
        repeat(num) {
            words[it] = readLine()
            trie.add(words[it])
        }
        
        var sum = 0
        words.forEach { 
            sum += trie.find(it)
        }
        
        bw.appendLine(String.format("%.2f", sum / num.toFloat()))
        n = readLine()
    }

    bw.flush()
    bw.close()
}

class Trie(val root: Node = Node(hashMapOf(), false)) {
    fun add(word: String) {
        var currentNode = root
        for (i in word) {
            currentNode = currentNode.child.getOrPut(i) { Node(hashMapOf(), false) }
        }
        currentNode.terminal = true
    }

    fun find(word: String): Int {
        var currentNode = root
        var cnt = 0
        for (i in word) {
            when {
                cnt == 0 -> cnt++
                currentNode.child.size > 1 -> cnt++
                currentNode.terminal -> cnt++
            }
            currentNode = currentNode.child.getOrElse(i) { return 0 }
        }
        return cnt
    }
}