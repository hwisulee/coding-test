import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c, zr, zc) = readLine().split(" ").map { it.toInt() }
    var arr = arrayOf<String>()
    repeat(r) {
        arr += readLine()
    }

    val sb = StringBuilder()
    for (i in arr.indices) {
        var temp = ""
        arr[i].forEach {
            for (j in 1 .. zc) {
                temp += it
            }
        }

        for (j in 1 .. zr) {
            sb.appendLine(temp)
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}