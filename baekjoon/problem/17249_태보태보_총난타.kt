import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().also {
        bw.write(it.split("(^0^)").map { it.count { it == '@' } }.joinToString(" "))
    }
    bw.flush()
    bw.close()
}