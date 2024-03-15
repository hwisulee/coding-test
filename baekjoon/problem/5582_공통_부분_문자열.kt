import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s1 = readLine()
    val s2 = readLine()
    var result = 0
    val arr = Array(s1.length + 1) { IntArray(s2.length + 1) }

    for (i in 1 .. s1.length) {
        for (j in 1 .. s2.length) {
            if (s1[i - 1] == s2[j - 1]) {
                arr[i][j] = arr[i - 1][j - 1] + 1
                result = Math.max(result, arr[i][j])
            }
        }
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}