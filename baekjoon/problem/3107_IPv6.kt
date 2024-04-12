import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().run {
        replace("::", ":".repeat(8 - split(":").size + 2))
    }.also {
        bw.write(it.split(":").joinToString(":") { it.padStart(4, '0') })
    }
    bw.flush()
    bw.close()
}