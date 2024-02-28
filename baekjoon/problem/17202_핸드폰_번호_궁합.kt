import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine().chunked(1).map { it.toInt() }
    val b = readLine().chunked(1).map { it.toInt() }
    var list = mutableListOf<Int>()
    for (i in 0 until a.size * 2) {
        list += if (i % 2 == 0) a[i / 2] else b[i / 2]
    }
    
    var size = 16
    while (size > 2) {
        val temp = mutableListOf<Int>()
        for (i in 1 .. list.lastIndex) {
            temp += (list[i - 1] + list[i]).toString().last().digitToInt()
        }
        list = temp
        size--
    }

    bw.write(list.joinToString(""))
    bw.flush()
    bw.close()
}