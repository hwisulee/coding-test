import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val num = BooleanArray(1000001)
    num[0] = true.also { num[1] = it }
    
    var i = 2
    while (i * i <= 1000000) {
        if (!num[i]) {
            var j = i + i
            while (j <= 1000000) {
                num[j] = true
                j += i
            }
        }
        i++
    }

    var case = br.readLine().toInt()
    
    while (case-- > 0) {
        val n = br.readLine().toInt()
        var answer = 0
        for (j in 2..n / 2) {
            if (!num[j] && !num[n - j]) answer++
        }
        bw.appendLine("$answer")
        bw.flush()
    }
    bw.close()
}