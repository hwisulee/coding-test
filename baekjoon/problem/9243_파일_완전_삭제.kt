import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    bw.write(rewriter(readLine(), readLine(), n))
    bw.flush()
    bw.close()
}

fun rewriter(a: String, b: String, num: Int): String {
    var result = "Deletion succeeded"
    if (num % 2 == 0) {
        for (i in a.indices) {
            if (a[i] != b[i]) {
                result = "Deletion failed"
                break
            }
        }
    } else {
        for (i in a.indices) {
            if (a[i] == b[i]) {
                result = "Deletion failed"
                break
            }
        }
    }

    return result
}