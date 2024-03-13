import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, g) = readLine().split(" ")
    val player = hashSetOf<String>()
    repeat(n.toInt()) {
        val input = readLine()
        if (!player.contains(input)) player += input
    }

    when (g) {
        "Y" -> {
            bw.write("${player.size}")
        }
        "F" -> {
            bw.write("${player.size / 2}")
        }
        "O" -> {
            bw.write("${player.size / 3}")
        }
    }
    bw.flush()
    bw.close()
}