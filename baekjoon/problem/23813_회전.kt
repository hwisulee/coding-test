import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val list = mutableListOf<BigInteger>()
    readLine().also {
        for (i in it.indices) {
            val sb = StringBuilder()

            if (list.isEmpty()) {
                sb.append(it.last()).append(it.substring(0, it.lastIndex))
            } else {
                val cur = list.last().toString()
                sb.append(cur.last()).append(cur.substring(0, it.lastIndex))
            }

            list += sb.toString().toBigInteger()
        }

        bw.write("${list.sumOf { it }}")
    }
    bw.flush()
    bw.close()
}