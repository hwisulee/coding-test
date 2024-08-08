import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val code = readLine()
    val codes = MutableList(readLine().toInt()) { readLine() }
    codes.filter { matches(code, it) }.also {
        bw.write("${it.size}\n")
        it.forEach { bw.write("${it}\n") }
    }

    bw.flush()
    bw.close()
}

fun matches(code: String, regCode: String): Boolean {
    for (i in code.indices) {
        if (code[i] != '*' && code[i] != regCode[i]) return false
    }

    return true
}