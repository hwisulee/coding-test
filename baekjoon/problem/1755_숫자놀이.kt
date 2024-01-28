import java.io.BufferedWriter
import java.io.OutputStreamWriter

lateinit var result: ArrayList<Pair<Int, String>>

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    result = arrayListOf()
    val (a, b) = readLine().split(" ").map { it.toInt() }
    (a..b).forEach {
        val (num, str) = numPairString(it)
        result += Pair(num, str)
    }

    result.sortedBy { it.second }.map { it.first }.chunked(10).forEach {
        bw.appendLine(it.joinToString(" "))
    }
    bw.flush()
    bw.close()
}

fun numPairString(num: Int): Pair<Int, String> {
    val sb = StringBuilder()
    val arr = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    num.toString().chunked(1).also { list ->
        val converted = list.map { arr[it.toInt()] }
        sb.append(converted.joinToString(" "))
    }

    return Pair(num, sb.toString())
}