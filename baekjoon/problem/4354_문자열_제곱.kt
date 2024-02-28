import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input = readLine()
    while (input != ".") {
        val last = makeTable(input)
        val remain = input.length % (input.length - last)
        val div = input.length / (input.length - last)
        bw.appendLine("${if (remain == 0) div else 1}")

        input = readLine()
    }
    bw.flush()
    bw.close()
}

fun makeTable(str: String): Int {
    val table = Array(str.length) { 0 }
    var idx = 0
    for (i in 1 until str.length) {
        while (idx > 0 && str[i] != str[idx]) idx = table[idx - 1]
        if (str[i] == str[idx]) table[i] = ++idx
    }

    return table.last()
}