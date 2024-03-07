import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.security.DigestException
import java.security.MessageDigest
import java.util.*

private val digits = "0123456789ABCDEF"

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write(hashSHA256(readLine()).lowercase(Locale.getDefault()))
    bw.flush()
    bw.close()
}

fun hashSHA256(msg: String): String {
    val hash: ByteArray
    try {
        val md = MessageDigest.getInstance("SHA-256")
        md.update(msg.toByteArray())
        hash = md.digest()
    } catch (e: CloneNotSupportedException) {
        throw DigestException("Couldn't make digset of partial content")
    }

    return bytesToHex(hash)
}

fun bytesToHex(byteArray: ByteArray): String {
    val hexChars = CharArray(byteArray.size * 2)
    for (i in byteArray.indices) {
       val v = byteArray[i].toInt() and 0xff
       hexChars[i * 2] = digits[v shr 4]
       hexChars[i * 2 + 1] = digits[v and 0xf]
    }

    return String(hexChars)
}