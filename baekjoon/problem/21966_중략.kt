import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()
    if (n <= 25) {
        bw.write(s)
    } else {
        val skip = s.substring(12, s.length - 12)

        var check = true
        for (i in skip) {
            if (i == '.') {
                check = false
                break
            }
        }

        if (check) {
            bw.write("${s.substring(0, 11)}...${s.substring(s.length - 11)}")
        } else {
            bw.write("${s.substring(0, 9)}......${s.substring(s.length - 10)}")
        }
    }

    bw.flush()
    bw.close()
}