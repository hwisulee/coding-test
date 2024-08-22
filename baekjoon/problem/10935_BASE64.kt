import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(getBASE64(readLine()))
    bw.flush()
    bw.close()
}

fun getBASE64(str: String): String = Base64.getEncoder().encodeToString(str.toByteArray())