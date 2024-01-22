import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        var check = false
        val (a, b) = readLine().split(" ")
        if (a.length == b.length) {
            if (a.groupingBy { it }.eachCount() == b.groupingBy { it }.eachCount()) check = true
        }

        bw.appendLine(if (check) "$a & $b are anagrams." else "$a & $b are NOT anagrams.")
    }

    bw.flush()
    bw.close()
}