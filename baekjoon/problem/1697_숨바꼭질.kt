import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = br.readLine().split(" ").map { it.toInt() }
    val tree = IntArray(100001)
    bfs(n, k, tree)

    bw.write("${tree[k]}")
    bw.flush()
    bw.close()
}

fun bfs(n: Int, k: Int, tree: IntArray) {
    var node = n
    val queue = ArrayDeque<Int>()
    queue.add(node)

    while (queue.isNotEmpty()) {
        node = queue.removeFirst()

        if (node == k) break
        if (node - 1 >= 0 && tree[node - 1] == 0) {
            queue.add(node - 1)
            tree[node - 1] = tree[node] + 1
        }
        if (node + 1 <= 100000 && tree[node + 1] == 0) {
            queue.add(node + 1)
            tree[node + 1] = tree[node] + 1
        }
        if (node * 2 <= 100000 && tree[node * 2] == 0) {
            queue.add(node * 2)
            tree[node * 2] = tree[node] + 1
        }
    }
}