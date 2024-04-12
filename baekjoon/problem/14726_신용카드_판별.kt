import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        val input = readLine().chunked(1).mapIndexed { index, s ->
            if (index % 2 == 0) {
                val cur = s.toInt() * 2
                if (cur >= 10) cur.toString().chunked(1).sumOf { it.toInt() } else cur
            } else {
                s.toInt()
            }
        }.sum()

        bw.write(if (input % 10 == 0) "T" else "F")
        if (it < t) bw.append("\n")
    }
    bw.flush()
    bw.close()
}