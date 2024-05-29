import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (r, c) = readLine().split(" ").map { it.toInt() }
    val map = Array<String>(r) { readLine() }
    var dic = arrayOf<String>()

    map.forEach {
        val cur = it.replace("#", ",").split(",")
        for (temp in cur) {
            if (temp.length >= 2) dic += temp
        }
    }
    for (i in 0 until c) {
        val sb = StringBuilder()
        for (j in 0 until r) {
            sb.append(map[j][i])
        }

        val cur = sb.toString().replace("#", ",").split(",")
        for (temp in cur) {
            if (temp.length >= 2) dic += temp.toString()
        }
    }

    bw.write(dic.sortedArray()[0])
    bw.flush()
    bw.close()
}