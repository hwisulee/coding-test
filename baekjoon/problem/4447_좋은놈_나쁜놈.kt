import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        val sb = StringBuilder()
        readLine().also {
            val g = it.count { it.lowercase() == "g" }
            val b = it.count { it.lowercase() == "b" }
            if (g > b) sb.append("$it is GOOD") else if (g < b) sb.append("$it is A BADDY") else sb.append("$it is NEUTRAL")
        }

        bw.appendLine(sb.toString())
        bw.flush()
    }

    bw.close()
}