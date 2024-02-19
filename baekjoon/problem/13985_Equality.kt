import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().split(" ").also {
        val a = it[0].toInt()
        val b = it[2].toInt()
        val result = it[4].toInt()

        when (it[1]) {
            "+" -> bw.write(if (a + b == result) "YES" else "NO")
            "-" -> bw.write(if (a - b == result) "YES" else "NO")
        }
    }
    bw.flush()
    bw.close()
}