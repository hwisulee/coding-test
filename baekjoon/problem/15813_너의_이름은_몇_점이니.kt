import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var score = 0
    val data = Pair(readLine().toInt(), readLine())
    data.second.forEach {
        score += it.code - 64
    }

    bw.write("$score")
    bw.flush()
    bw.close()
}