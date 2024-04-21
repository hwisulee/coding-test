'import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val board = mutableListOf<List<String>>()
    var allCount = 0
    repeat(n) {
        board += readLine().split(" ").map {
            allCount += it.count { it == '9' }
            it
        }
    }

    val cnt = IntArray(2)
    board.forEachIndexed { index, list ->
        cnt[0] = cnt[0].coerceAtLeast(list.joinToString("").count { it == '9' })
    }

    for (i in 0 until m) {
        val sb = StringBuilder()

        for (j in 0 until n) {
            sb.append(board[j][i])
        }

        cnt[1] = cnt[1].coerceAtLeast(sb.toString().count { it == '9' })
    }

    allCount -= cnt.max()

    bw.write("$allCount")
    bw.flush()
    bw.close()
}