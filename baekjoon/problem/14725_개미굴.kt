import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class Trie(val node: String, val arr: ArrayList<Trie>)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val result = StringBuilder()
    val trie = Trie("", ArrayList())
    repeat(n) {
        val input = readLine().split(" ")
        var node = trie

        for (i in 1 .. input[0].toInt()) {
            val cur = input[i]
            var idx = -1
            for (j in 0 until node.arr.size) {
                if (node.arr[j].node == cur) { idx = j; break }
            }

            if (idx == -1) {
                node.arr += Trie(cur, ArrayList())
                node = node.arr[node.arr.size - 1]
            } else {
                node = node.arr[idx]
            }
        }
    }

    dfs(trie, -1, result)
    bw.write(result.toString())
    bw.flush()
    bw.close()
}

fun dfs(trie: Trie, depth: Int, result: StringBuilder) {
    trie.arr.sortBy { it.node }
    if (depth != -1) {
        for (i in 0 until depth) result.append("--")
        result.appendLine(trie.node)
    }

    trie.arr.forEach { dfs(it, depth + 1, result) }
}