import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = readLine().split(" ").filter { it.endsWith("Cheese") }

    bw.write(if (list.distinct().count() >= 4) "yummy" else "sad")
    bw.flush()
    bw.close()
}