import java.io.*

var answer = 0
var numbering = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, r, c) = br.readLine().split(" ").map { it.toInt() }
    cal(1 shl(n), 0, 0, r, c)

    bw.write("$answer")
    bw.flush()
    bw.close()
}

fun cal(size: Int, row: Int, col: Int, targetRow: Int, targetCol: Int) {
    if (targetRow !in row until row + size || targetCol !in col until col + size) {
        numbering += size * size
        return
    }

    if (row == targetRow && col == targetCol) {
        answer = numbering
        return
    }

    val halfSize = size / 2

    cal(halfSize, row, col, targetRow, targetCol)
    cal(halfSize, row, col + halfSize, targetRow, targetCol)
    cal(halfSize, row + halfSize, col, targetRow, targetCol)
    cal(halfSize, row + halfSize, col + halfSize, targetRow, targetCol)
}