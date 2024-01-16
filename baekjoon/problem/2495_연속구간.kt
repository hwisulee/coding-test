import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.max

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    repeat(3) {
        var prev = ' '
        var cnt = 1
        var max = 1
        
        readLine().forEach {
            if (prev == it) cnt++
            else {
                prev = it
                if (cnt != 1) cnt = 1
            }

            max = max(max, cnt)
        }

        bw.appendLine("$max")
    }

    bw.flush()
    bw.close()
}