import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = readLine().split(" ")
    val samPos = IntArray(2) { -1 }
    val map = Array(b.length) { Array(a.length) { '.' } }
    for (x in a.indices) {
        if (samPos.minOf { it } == -1) {
            for (y in b.indices) {
                if (b[y] == a[x]) {
                    samPos[0] = y
                    samPos[1] = x
                    break
                }
            }
        } else {
            break
        }
    }

    for (x in map[samPos[0]].indices) map[samPos[0]][x] = a[x]
    for (y in map.indices) map[y][samPos[1]] = b[y]

    map.map { bw.appendLine(it.joinToString("")) }
    bw.flush()
    bw.close()
}