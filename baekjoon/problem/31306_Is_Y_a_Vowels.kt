import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    val vowels = "aeiouy"

    val counts = IntArray(2)
    for (i in str.indices) {
        if (str[i] in vowels) {
            counts[0]++
            counts[1]++

            if (str[i] == 'y') counts[0]--
        }
    }

    bw.write("${counts[0]} ${counts[1]}")
    bw.flush()
    bw.close()
}