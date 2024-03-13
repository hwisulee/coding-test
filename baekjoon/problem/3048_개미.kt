import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n1, n2) = readLine().split(" ").map { it.toInt() }
    val ant = Array(2) { "" }
    for (i in ant.indices) {
        ant[i] = if (i == 0) readLine().reversed() else readLine()
    }
    var t = readLine().toInt()
    if (t > n1 + n2) t = n1 + n2 - 1

    val antPos = ant.joinToString("").toCharArray()
    val status = BooleanArray(n1 + n2) { false }
    for (i in 0 until n1) {
        status[i] = true
    }

    while (t-- > 0) {
        var idx = 0
        while (idx < n1 + n2 - 1) {
            if (status[idx] && !status[idx + 1]) {
                antPos[idx] = antPos[idx + 1].also { antPos[idx + 1] = antPos[idx] }
                status[idx] = status[idx + 1].also { status[idx + 1] = status[idx] }
                idx++
            }
            idx++
        }
    }

    bw.write(antPos.joinToString(""))
    bw.flush()
    bw.close()
}