import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (c, n) = readLine().split(" ").map { it.toInt() }
    val color = Array(c) { readLine() }
    val name = Array(n) { readLine() }
    val team = Array(readLine().toInt()) { readLine() }

    for (i in team) {
        val check = BooleanArray(2)

        for (j in color) {
            if (i.contains(j)) {
                check[0] = true
                break
            }
        }

        for (j in name) {
            if (i.contains(j)) {
                check[1] = true
                break
            }
        }

        bw.appendLine(if (check.count { it } == 2) "Yes" else "No")
    }
    bw.flush()
    bw.close()
}