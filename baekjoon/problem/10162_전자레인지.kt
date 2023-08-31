import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val result = intArrayOf(0, 0, 0)
    var t = br.readLine().toInt()

    if (t % 10 != 0) bw.write("-1")
    else {
        if (t / 300 > 0) { result[0] = t / 300; t %= 300; }
        if (t / 60 > 0) { result[1] = t / 60; t %= 60; }
        if (t / 10 > 0) { result[2] = t / 10; t %= 10; }

        bw.write(result.joinToString(" "))
    }

    bw.flush()
    bw.close()
}