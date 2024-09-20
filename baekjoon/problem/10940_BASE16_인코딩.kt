import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(readLine().toByteArray().toHex())
    bw.flush()
    bw.close()
}

fun ByteArray.toHex(): String = joinToString("") { "%02X".format(it) }
