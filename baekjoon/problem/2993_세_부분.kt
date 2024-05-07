import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val word = readLine()
    var result = word

    for (i in 0 until word.lastIndex - 1) {
        for (j in i + 1 until word.lastIndex) {
            val cur = StringBuilder(word)

            cur.replace(0, i + 1, cur.substring(0, i + 1).reversed())
            cur.replace(i + 1, j + 1, cur.substring(i + 1, j + 1).reversed())
            cur.replace(j + 1, word.length, cur.substring(j + 1, word.length).reversed())
            result = minOf(cur.toString(), result)
        }
    }
    
    bw.write(result)
    bw.flush()
    bw.close()
}