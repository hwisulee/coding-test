import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        var cur = readLine()

        while (cur.contains("!")) {
            when {
                cur.contains("0!") -> cur = cur.replace("0!", "1")
                cur.contains("1!") -> cur = cur.replace("1!", "1")
                cur.contains("!0") -> cur = cur.replace("!0", "1")
                cur.contains("!1") -> cur = cur.replace("!1", "0")
            }
        }
        bw.write("$cur\n")
    }
    bw.flush()
    bw.close()
}