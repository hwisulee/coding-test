import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val input = readLine()
        when (input) {
            "#" -> break
            else -> {
                input.lowercase().replaceFirst(' ', ':').split(":").also { list ->
                    bw.appendLine("${list[0]} ${list[1].count { it.toString() == list[0] }}")
                }
            }
        }
    }
    bw.flush()
    bw.close()
}