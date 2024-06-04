import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.system.exitProcess

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val password = readLine()
    val n = readLine().toInt()
    val dic = Array(n) { readLine() }

    for (i in 0 .. 26) {
        val temp =  password.map {
            if (it != ' ') {
                var cur = it.code + i
                if (cur > 'z'.code) cur = cur - 'z'.code + 96
                cur.toChar()
            } else {
                ' '
            }
        }.joinToString("")
        
        for (j in dic) {
            if (temp.contains(j)) {
                bw.write(temp)
                bw.flush()
                exitProcess(0)
            }
        }
    }

    bw.close()
}