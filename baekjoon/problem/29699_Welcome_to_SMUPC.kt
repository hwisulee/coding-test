import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    "WelcomeToSMUPC".also {
        val idx = readLine().toInt()
        bw.write("${if (idx > it.length) it[if (idx % 14 <= 0) 14 - 1 else idx % 14 - 1] else it[idx - 1]}")
    }
    bw.flush()
    bw.close()
}