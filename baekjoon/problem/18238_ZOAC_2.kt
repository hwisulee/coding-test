import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.abs
import kotlin.math.min


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    var cur = 'A'
    readLine().forEachIndexed { index, c ->
        val temp = abs(c - cur)
        cnt += min(temp, 26 - temp)
        cur = c
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}