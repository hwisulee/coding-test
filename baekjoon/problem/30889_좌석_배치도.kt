import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = Array(10) { Array(20) { '.' } }
    repeat(readLine().toInt()) {
        val cur = readLine()
        val r = cur.substring(1).toInt() - 1
        val c = cur[0].code - 65
        map[c][r] = 'o'
    }

    map.forEach {
        it.forEach { c ->
            bw.write("$c")
        }
        bw.newLine()
    }
    bw.flush()
    bw.close()
}