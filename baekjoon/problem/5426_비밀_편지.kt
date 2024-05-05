import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.sqrt

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = readLine().toInt()
    repeat(t) {
        readLine().also {
            val temp = sqrt(it.length.toDouble()).toInt()
            val before = it.chunked(temp)
            val sb = StringBuilder()

            for (j in temp - 1 downTo 0) {
                for (i in before.indices) {
                    sb.append(before[i][j])
                }
            }

            bw.appendLine(sb.toString())
            bw.flush()
        }
    }
    
    bw.close()
}