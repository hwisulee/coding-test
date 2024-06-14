import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r,c) = readLine().split(" ").map { it.toInt() }
    val original = Array(r) { readLine() }
    readLine()
    val program = Array(r) { readLine() }

    var cnt = 0
    original.forEachIndexed { i, s ->
        s.forEachIndexed { j, c ->
            if (c == program[i][j]) cnt++
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}
