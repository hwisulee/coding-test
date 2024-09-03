import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val str = readLine()
    val password = readLine()

    val arr = IntArray(200)
    var result = 0
    val size = str.length

    for (i in str.indices) {
        val index = str[i].code - '!'.code
        if (arr[index] == 0) arr[index] = i + 1
    }

    for (element in password) {
        val index = element.code - '!'.code

        result *= size
        result += arr[index]
        result %= 900528
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}