import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().also {
        bw.write("${it.length + it.count { it == ':' } + it.count { it == '_'} * 5}")
    }
    bw.flush()
    bw.close()
}