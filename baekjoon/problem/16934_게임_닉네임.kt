import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

val map: MutableMap<String, Int> = mutableMapOf()

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val trie = Trie()
    for (i in 0 until n) {
        val nickname = readLine()
        bw.appendLine(trie.insert(nickname))
    }

    bw.flush()
    bw.close()
}

class Trie(private val root: TrieNode = TrieNode()) {
    fun insert(key: String): String {
        var cur = root
        var k = key.length
        var flag = false

        for (i in key.indices) {
            val c = key[i]

            if (!cur.children.containsKey(c)) {
                cur.children[c] = TrieNode()

                if (!flag) {
                    k = i + 1
                    flag = true
                    cur.count++
                }
            }

            cur = cur.children[c]!!
        }

        if (!map.containsKey(key)) {
            map[key] = 1
            return key.substring(0, k)
        } else {
            map[key] = map[key]!! + 1
            return key.substring(0, k) + map[key]
        }
    }
}

class TrieNode {
    val children = HashMap<Char, TrieNode>()
    var count = 0
}