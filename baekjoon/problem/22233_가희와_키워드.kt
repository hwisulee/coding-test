import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val set = HashSet<String>(n)
    repeat(n) {
        set += readLine()
    }

    repeat(m) {
        val post = readLine().split(",")
        post.forEach {
            set.remove(it)
        }

        bw.appendLine("${set.size}")
        bw.flush()
    }

    bw.close()
}