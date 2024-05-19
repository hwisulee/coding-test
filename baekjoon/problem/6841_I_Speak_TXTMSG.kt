import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        bw.appendLine(checkAndReturn(input))
        bw.flush()
        if (input == "TTYL") break
    }
    bw.close()
}

fun checkAndReturn(str: String): String {
    return when (str) {
        "CU" -> "see you"
        ":-)" -> "I’m happy"
        ":-(" -> "I’m unhappy"
        ";-)" -> "wink"
        ":-P" -> "stick out my tongue"
        "(~.~)" -> "sleepy"
        "TA" -> "totally awesome"
        "CCC" -> "Canadian Computing Competition"
        "CUZ" -> "because"
        "TY" -> "thank-you"
        "YW" -> "you’re welcome"
        "TTYL" -> "talk to you later"
        else -> str
    }
}