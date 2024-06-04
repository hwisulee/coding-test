import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val input = readLine()
    for (c in input) {
        sb.append("#")
        sb.append(c)
    }
    sb.append("#")

    val list = MutableList(sb.length) { 0 }
    manachers(sb.toString(), list)

    var result = -1
    for (i in list.indices) {
        result = maxOf(result, list[i])
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}

fun manachers(text: String, list: MutableList<Int>) {
    val length = text.length
    var r = 0
    var c = 0

    for (i in 0 until length) {
        if (r < i) list[i] = 0 else list[i] = minOf(list[2 * c - i], r - i)
        while (i - list[i] - 1 >= 0 && i + list[i] + 1 < length && text[i - list[i] - 1] == text[i + list[i] + 1]) list[i]++

        if (r < i + list[i]) {
            r = i + list[i]
            c = i
        }
    }
}