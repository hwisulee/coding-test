import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val (n, m) = readLine().split(" ")
        when (n) {
            "1" -> {
                val t = m.split(".").map {
                    val cur = Integer.toBinaryString(it.toInt())
                    if (cur.length < 8) cur.padStart(8, '0') else cur
                }
                bw.write("${BigInteger(t.joinToString(""), 2)}\n")
            }
            else -> {
                val t = m.toBigInteger().toString(2).padStart(64, '0').chunked(8).map {
                    it.toInt(2)
                }
                bw.write("${t.joinToString(".")}\n")
            }
        }
    }
    bw.flush()
    bw.close()
}