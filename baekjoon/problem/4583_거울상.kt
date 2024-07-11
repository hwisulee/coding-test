import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (readLine().also { input = it } != "#") {
        var flag = false
        val sb = StringBuilder(input!!.reversed())
        for (i in sb.indices) {
            when (sb[i]) {
                'b' -> sb[i] = 'd'
                'd' -> sb[i] = 'b'
                'p' -> sb[i] = 'q'
                'q' -> sb[i] = 'p'
                'i', 'o', 'v', 'w', 'x' -> continue
                else -> flag = true
            }
        }

        bw.appendLine(if (flag) "INVALID" else sb.toString())
    }
    bw.flush()
    bw.close()
}