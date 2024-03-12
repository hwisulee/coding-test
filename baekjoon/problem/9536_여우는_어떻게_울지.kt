import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    var sound: List<String>
    repeat(t) {
        sound = readLine().split(" ")

        while (true) {
            val input = readLine()
            if (input == "what does the fox say?") break
            sound = sound.filterNot { it == input.split(" ")[2] }
        }

        bw.appendLine(sound.joinToString(" "))
    }

    bw.flush()
    bw.close()
}