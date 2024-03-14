import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = 0
    val n = readLine().toInt()
    val list = ArrayList<String>()
    repeat(n) {
        list += readLine()
    }

    list.sortBy { it.length }
    for (i in list.indices) {
        var check = true
        for (j in i + 1 until list.size) {
            if (list[j].startsWith(list[i])) {
                check = false
                break
            }
        }

        if (check) result++
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}