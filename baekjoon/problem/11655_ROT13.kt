import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    var s = readLine().forEach {
        when (it) {
            in 'a' .. 'z' -> {
                if (it + 13 > 'z') sb.append(it + 13 - ('a' .. 'z').count()) else sb.append(it + 13)
            }
            in 'A' .. 'Z' -> {
                if (it + 13 > 'Z') sb.append(it + 13 - ('a' .. 'z').count()) else sb.append(it + 13)
            }
            else -> {
                sb.append(it)
            }
        }
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}