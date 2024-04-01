import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c) = readLine().split(" ").map { it.toInt() }
    val map = MutableList(r) { readLine() }
    val new = mutableListOf<String>()

    for (i in 0 until 2) {
        when (i) {
            0 -> {
                map.forEach {
                    new += it + it.reversed()
                }
            }
            1 -> {
                map.reversed().forEach {
                    new += it + it.reversed()
                }
            }
        }

    }

    val (er, ec) = readLine().split(" ").map { it.toInt() - 1 }
    new[er] = new[er].replaceRange(ec .. ec, if (new[er][ec] == '.') "#" else ".")
    new.forEach { bw.appendLine(it) }
    bw.flush()
    bw.close()
}