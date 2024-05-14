import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(3) {
        readLine().split(" ").also { cur ->
            val cnt = cur.count { it == "0" }
            val result = when (cnt) {
                4 -> "D"
                3 -> "C"
                2 -> "B"
                1 -> "A"
                else -> "E"
            }

            bw.appendLine(result)
        }
    }
    
    bw.flush()
    bw.close()
}