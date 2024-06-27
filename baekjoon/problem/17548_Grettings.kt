import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().also {
        val cnt = it.count { it == 'e' }
        bw.write("h${"e".repeat(cnt * 2)}y")
    }
    bw.flush()
    bw.close()
}