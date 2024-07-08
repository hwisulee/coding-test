import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, s) = readLine().split(" ")
    val list = MutableList(n.toInt()) {
        val (name, chat) = readLine().split(" ")
        Pair(name, chat)
    }

    var count = 0
    val filteredList = list.filter { it.second == list.find { it.first == s }!!.second }
    for (i in filteredList.indices) {
        if (filteredList[i].first == s) break
        count++
    }

    bw.write("$count")
    bw.flush()
    bw.close()
}