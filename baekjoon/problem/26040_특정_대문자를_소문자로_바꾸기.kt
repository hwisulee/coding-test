import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine()
    val b = readLine().split(" ").map { it }
    a.also {
        var sb = it
        b.forEach {
            sb = sb.replace("[${it}]".toRegex(), it.lowercase())
        }

        bw.write(sb.toString())
    }

    bw.flush()
    bw.close()
}