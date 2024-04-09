import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


val trie = Trie()
lateinit var board: Array<CharArray>
lateinit var visited: Array<BooleanArray>
val dx = intArrayOf(0, 0, -1, 1, 1, 1, -1, -1)
val dy = intArrayOf(-1, 1, 0, 0, 1, -1, 1, -1)

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val w = readLine().toInt()
    repeat(w) {
        trie.insert(readLine())
    }
    readLine()

    val b = readLine().toInt()
    repeat(b) {
        board = Array(4) { CharArray(4) }
        visited = Array(4) { BooleanArray(4) }

        for (i in 0 until 4) {
            readLine().forEachIndexed { j, c ->
                board[i][j] = c
            }
        }

        val strSet = HashSet<String>()
        for (y in 0 until 4) {
            for (x in 0 until 4) {
                visited[y][x] = true
                dfs(x, y, board[y][x] + "", strSet)
                visited[y][x] = false
            }
        }

        printResult(strSet, bw)

        if (it < b) readLine()
    }

    bw.close()
}

fun printResult(strSet: HashSet<String>, bw: BufferedWriter) {
    val list = ArrayList<String>(strSet).sorted()
    var score = 0

    for (i in list) {
        score += getScore(i.length)
    }

    bw.appendLine("$score ${list.maxBy { it.length }} ${list.size}")
    bw.flush()
}

fun getScore(length: Int): Int {
    var score = 0
    score += when (length) {
        3, 4 -> 1
        5 -> 2
        6 -> 3
        7 -> 5
        8 -> 11
        else -> 0
    }

    return score
}

fun dfs(x: Int, y: Int, str: String, strSet: HashSet<String>) {
    if (trie.find(str, true)) strSet.add(str)

    for (i in 0 until 8) {
        val nx = x + dx[i]
        val ny = y + dy[i]

        if (nx < 0 || nx >= 4 || ny < 0 || ny >= 4) continue
        if (visited[ny][nx]) continue

        val key = str + board[ny][nx]
        if (trie.find(key, false)) {
            visited[ny][nx] = true
            dfs(nx, ny, key, strSet)
            visited[ny][nx] = false
        }
    }
}

class Trie(private val root: TrieNode = TrieNode()) {
    fun insert(key: String) {
        val length = key.length
        var cur = root

        for (i in 0 until length) {
            val next = key[i] - 'A'
            if (cur.child[next] == null) {
                cur.child[next] = TrieNode()
                cur.nodeChild++
            }

            cur = cur.child[next]!!
        }

        cur.isFinish = true
    }

    fun find(key: String, isCompleteString: Boolean): Boolean {
        val length = key.length
        var cur = root

        for (i in 0 until length) {
            val next = key[i] - 'A'
            if (cur.child[next] == null) return false
            cur = cur.child[next]!!
        }

        return if (isCompleteString) cur.isFinish else true
    }
}

class TrieNode {
    val child = arrayOfNulls<TrieNode>(26)
    var isFinish = false
    var nodeChild = 0
}