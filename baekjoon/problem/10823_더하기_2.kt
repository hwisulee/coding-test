import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    val list = mutableListOf<String>()
    while (true) {
        input = readLine()
        if (input.isNullOrEmpty()) break
        list += input
    }

    bw.write("${list.joinToString("").split(",").sumOf { it.toInt() }}")
    bw.flush()
    bw.close()
}