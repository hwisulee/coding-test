import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(if (readLine().toInt() % 2 == 0) "SciComLove" else "evoLmoCicS")
    bw.flush()
    bw.close()
}