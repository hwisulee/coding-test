import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val result = IntArray(26)

    repeat(n) {
        val (a, b) = readLine().split(" ")
        val count = Array(2) { IntArray(26) }

        a.forEach { count[0][it - 'a']++ }
        b.forEach { count[1][it - 'a']++ }

        for (i in 0 until 26) {
            result[i] += maxOf(count[0][i], count[1][i])
        }
    }

    result.forEach { bw.write("$it\n") }
    bw.flush()
    bw.close()
}