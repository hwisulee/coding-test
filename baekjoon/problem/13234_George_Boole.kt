import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().split(" ").also {
        val a = it[0] == "true"
        val b = it[2] != "false"
        val result = when (it[1]) {
            "AND" -> a && b
            "OR" -> a || b
            else -> false
        }

        bw.write("$result")
    }
    bw.flush()
    bw.close()
}