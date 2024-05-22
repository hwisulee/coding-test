import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val str = readLine().replace("[^b|s]".toRegex(), "").groupingBy { it }.eachCount()

    val sSize = str.getOrDefault('s', 0)
    val bSize = str.getOrDefault('b', 0)
    bw.write(when {
        sSize == bSize -> "bigdata? security!"
        sSize > bSize -> "security!"
        sSize < bSize -> "bigdata?"
        else -> "Error"
    })
    bw.flush()
    bw.close()
}