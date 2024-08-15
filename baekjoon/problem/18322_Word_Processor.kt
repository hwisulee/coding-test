import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, k) = readLine().split(" ").map { it.toInt() }
    val words = readLine().split(" ")

    var curLength = 0
    for (word in words) {
        if (curLength + word.length > k) {
            bw.newLine()
            bw.write(word)
            curLength = word.length
        } else {
            if (curLength > 0) {
                bw.write(" ")
            }
            bw.write(word)
            curLength += word.length
        }
    }

    bw.flush()
    bw.close()
}