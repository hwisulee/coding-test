import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = MutableList<String>(n) { readLine() }
    var result: String?
    list.also {
        val sorted = it.sorted()
        result = if (sorted == it) "INCREASING" else if (sorted.reversed() == it) "DECREASING" else "NEITHER"
    }

    bw.write(result!!)
    bw.flush()
    bw.close()
}