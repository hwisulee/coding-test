import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val word = readLine()
    var result = "z".repeat(50)
    for (i in 0 .. word.lastIndex - 2) {
        for (j in i + 1 until word.lastIndex) {
            val sb = StringBuilder()
            word.also {
                sb.append(it.slice(0 .. i).reversed())
                sb.append(it.slice(i + 1 .. j).reversed())
                sb.append(it.slice(j + 1..word.lastIndex).reversed())
            }
            result = minOf(result, sb.toString())
        }
    }

    bw.write(result)
    bw.flush()
    bw.close()
}