import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val list = MutableList(n) {
        val cur =  readLine().split(" ")
        Pair(cur[0], cur[1].toInt())
    }

    bw.write(list.sortedWith(compareByDescending<Pair<String, Int>> { it.second }.thenBy { it.first }).first().first)
    bw.flush()
    bw.close()
}