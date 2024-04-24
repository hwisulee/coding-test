import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c) = readLine().split(" ").map { it.toInt() }
    val input = MutableList<String>(r) { readLine() }
    val list = mutableListOf<String>()
    var cnt = 0

    for (i in 0 until c) {
        list.add(input.map { it[i] }.joinToString(""))
    }

    for (i in 1 .. r) {
        val temp = mutableSetOf<String>()
        list.forEach {
            temp.add(it.substring(i - 1, r))
        }

        if (temp.size == c) cnt++ else break
    }

    bw.write("${cnt - 1}")
    bw.flush()
    bw.close()
}