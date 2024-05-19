import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val word = readLine().let { if (it.length % 2 != 0) it.repeat(2) else it }
        val a = word.mapIndexed { index, c -> if (index % 2 == 0) c else "" }.joinToString("")
        val b = word.mapIndexed { index, c -> if (index % 2 != 0) c else "" }.joinToString("")
        bw.appendLine("$a\n$b")
        bw.flush()
    }
    bw.close()
}