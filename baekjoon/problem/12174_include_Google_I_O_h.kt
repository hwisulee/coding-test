import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val b = readLine().toInt()
        val str = readLine().replace("I", "1").replace("O", "0").chunked(8)
        val sb = StringBuilder()
        str.forEach {
            sb.append(it.toInt(2).toChar())
        }

        bw.write("Case #${it + 1}: $sb\n")
    }
    bw.flush()
    bw.close()
}