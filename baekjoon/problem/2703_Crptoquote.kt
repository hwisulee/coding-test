import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        bw.appendLine(cryptoQuote(readLine(), readLine()))
    }
    bw.flush()
    bw.close()
}

fun cryptoQuote(str: String, rule: String): String {
    val sb = StringBuilder()
    str.forEach {
        try {
            sb.append(rule[it.code - 65])
        } catch (e: StringIndexOutOfBoundsException) {
            sb.append(" ")
        }
    }

    return sb.toString()
}