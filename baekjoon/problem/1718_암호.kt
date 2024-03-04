import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    var idx = 0
    val str = readLine()
    val sb = StringBuilder()
    val pass = readLine().map { it.code }
    for (i in str) {
        if (idx > pass.lastIndex) idx = 0
        if (i != ' ') {
            var temp = i.code - pass[idx]
            while (true) {
                if (temp in 1 .. 26) break
                if (temp < 1) temp += 26
                if (temp > 26) temp -= 26
            }
            sb.append((temp + 96).toChar())
            idx++
        } else {
            sb.append(" ")
            idx++
            continue
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}