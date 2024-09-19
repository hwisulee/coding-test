import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c) = readLine().split(" ").map { it.toInt() }
    val (rg, cg, rp, cp) = readLine().split(" ").map { it.toInt() }
    var answer = rp * cp

    repeat(r) {
        for (ch in readLine()) {
            if (ch == 'P') answer--
        }
    }

    bw.write("${if (answer != 0) 1 else 0}")
    bw.flush()
    bw.close()
}