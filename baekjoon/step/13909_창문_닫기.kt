import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var cnt = 0
    var i = 1

    while (i * i <= n) {
        cnt++
        i++
    }

    bw.append("$cnt")
    bw.flush()
    bw.close()
}