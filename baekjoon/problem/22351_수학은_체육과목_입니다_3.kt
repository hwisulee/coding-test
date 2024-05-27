import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    var idx = 1
    val sb = StringBuilder()

    if (s.length < 4) {
        for (i in 1 until s.length) {
            if (s[i] != s[0]) { idx = i; break }
        }
    }

    if (idx != s.length) {
        for (i in 1..999) {
            if (s.startsWith("$i")) {
                var temp = s

                for (j in i..999) {
                    if (temp.startsWith("$j")) {
                        temp = temp.substring("$j".length)
                    } else {
                        break
                    }
                    
                    if (temp.isEmpty()) { sb.append("$i $j"); break }
                }
                if (sb.isNotEmpty()) break
            }
        }
    } else {
        sb.append("$s $s")
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}