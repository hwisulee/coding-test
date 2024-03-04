import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine().chunked(1)
    val b = readLine().chunked(1)
    val sb = StringBuilder()
    for (i in a.indices) {
        sb.append(Integer.parseInt(a[i]) and Integer.parseInt(b[i]))
    }
    sb.appendLine()
    for (i in a.indices) {
        sb.append(Integer.parseInt(a[i]) or Integer.parseInt(b[i]))
    }
    sb.appendLine()
    for (i in a.indices) {
        sb.append(Integer.parseInt(a[i]) xor Integer.parseInt(b[i]))
    }
    sb.appendLine()
    for (i in a.indices) {
        sb.append(Integer.parseInt(a[i]) xor 1)
    }
    sb.appendLine()
    for (i in a.indices) {
        sb.append(Integer.parseInt(b[i]) xor 1)
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}