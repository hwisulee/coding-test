import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(getBASE64(readLine()))
    bw.flush()
    bw.close()
}

fun getBASE64(str: String): String = Base64.getDecoder().decode(str).decodeToString()