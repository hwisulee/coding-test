import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val pattern = listOf("a", "b", "k", "d", "e", "g", "h", "i", "l", "m", "n", "ng", "o", "p", "r", "s", "t", "u", "w", "y")
    val dic = List(readLine().toInt()) { readLine() }

    bw.write(customSort(dic, pattern).joinToString("\n"))
    bw.flush()
    bw.close()
}

fun customSort(dic: List<String>, order: List<String>): List<String> {
    val orderMap = order.withIndex().associate { it.value to it.index }

    return dic.sortedWith(Comparator { o1, o2 ->
        var i = 0
        var j = 0

        while (i < o1.length && j < o2.length) {
            val sub1 = if (i < o1.length - 1 && o1.substring(i, i + 2) == "ng") "ng" else o1[i].toString()
            val sub2 = if (j < o2.length - 1 && o2.substring(j, j + 2) == "ng") "ng" else o2[j].toString()

            val order1 = orderMap[sub1] ?: Int.MAX_VALUE
            val order2 = orderMap[sub2] ?: Int.MAX_VALUE

            if (order1 != order2) return@Comparator  order1 - order2

            i += if (sub1 == "ng") 2 else 1
            j += if (sub2 == "ng") 2 else 1
        }

        o1.length - o2.length
    })
}