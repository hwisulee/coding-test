import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input = readLine()
    while (input != "#") {
        var sum = 0
        var idx = input.length - 1
        for (i in input.indices) {
            sum += (sorter(input[i]) * 8.0.pow(idx)).toInt()
            idx--
        }
        bw.appendLine("$sum")
        input = readLine()
    }
    bw.flush()
    bw.close()
}

fun sorter(str: Char): Int {
    return when(str) {
        '-' -> 0
        '\\' -> 1
        '(' -> 2
        '@' -> 3
        '?' -> 4
        '>' -> 5
        '&' -> 6
        '%' -> 7
        '/' -> -1
        else -> -999
    }
}