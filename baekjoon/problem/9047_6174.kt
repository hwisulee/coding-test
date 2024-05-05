import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        bw.appendLine("${kaprekar(readLine())}")
    }
    bw.flush()
    bw.close()
}

fun kaprekar(str: String): Int {
    var result = str
    var count = 0

    while (result != "6174") {
        val max = result.toCharArray().sortedDescending().joinToString("").toInt()
        val min = result.toCharArray().sorted().joinToString("").toInt()
        result = (max - min).toString()

        if (result.length < 4) result = result.padStart(4, '0')
        count += 1
    }

    return count
}