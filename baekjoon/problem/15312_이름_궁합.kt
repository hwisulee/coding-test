import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine()
    val b = readLine()
    val sb = StringBuilder()
    for (i in a.indices) {
        sb.append(a[i]).append(b[i])
    }

    val arr = intArrayOf(3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1)
    var list = sb.toString().map { arr[it.code - 65] }.toMutableList()
    while (list.size > 2) {
        val temp = mutableListOf<Int>()
        for (i in 1 until list.size) {
            val sum = list[i - 1] + list[i]
            temp += if (sum >= 10) sum.toString().last().digitToInt() else sum
        }
        list = temp
    }

    bw.write(list.joinToString(""))
    bw.flush()
    bw.close()
}