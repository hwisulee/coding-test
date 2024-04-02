import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c) = readLine().split(" ").map { it.toInt() }
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val line = StringBuilder()
    val sb1 = StringBuilder()
    val sb2 = StringBuilder()

    repeat(a) {
        var temp = c
        while (temp > 0) {
            temp--
            sb1.append("X".repeat(b))
            sb2.append(".".repeat(b))
            if (temp <= 0) break

            temp--
            sb1.append(".".repeat(b))
            sb2.append("X".repeat(b))
        }
        if (it < a) {
            sb1.append("\n")
            sb2.append("\n")
        }
    }

    for (i in 1  .. r) {
        line.append(if (i % 2 != 0) sb1.toString() else sb2.toString())
    }

    bw.write(line.toString())
    bw.flush()
    bw.close()
}