import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (m, n) = readLine().split(" ").map { it.toInt() }
    bw.write(converter(m, n))
    bw.flush()
    bw.close()
}

fun converter(num: Int, base: Int): String {
    val sb = StringBuilder()
    var temp = num

    if (temp == 0) return "0"

    while (temp != 0) {
        val remainder = temp % base

        if (remainder > 9) sb.insert(0, Char((remainder + 55).toUShort()))
        else sb.insert(0, remainder)

        temp /= base
    }

    return sb.toString()
}