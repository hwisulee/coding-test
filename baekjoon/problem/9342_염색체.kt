import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        bw.write(if (readLine().matches("[A-F]?A+F+C+[A-F]?$".toRegex())) "Infected!" else "Good")
        if (it < t) bw.append("\n")
    }
    bw.flush()
    bw.close()
}