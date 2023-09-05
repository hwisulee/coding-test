import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = Array(8) { i -> IntArray(8) { j ->  i + j + 1 } }

    val new = Array(8) { Array(8) { "0" } }
    repeat(8) { i ->
        val temp = readLine().chunked(1)
        repeat(8) { j -> new[i][j] = temp[j] }
    }

    var cnt = 0
    repeat(8) { i ->
        repeat(8) { if (map[i][it] % 2 != 0 && new[i][it] == "F") cnt++ }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}