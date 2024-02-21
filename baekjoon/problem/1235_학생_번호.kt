import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = mutableListOf<String>()
    repeat(n) { list.add(readLine().reversed()) }

    for (i in 1 .. list[0].length) {
        val set = mutableSetOf<String>()

        for (j in list) {
            set.add(j.substring(0 until i))
        }

        if (set.size == list.size) {
            bw.appendLine("$i")
            break
        }
    }
    bw.flush()
    bw.close()
}
