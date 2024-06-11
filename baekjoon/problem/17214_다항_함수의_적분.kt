import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val polynomial = readLine()
    var result = ""

    val linearTermRegex = Regex("-?\\d+x")
    val constantRegex = Regex("[-, +]?\\d+$")

    val linearTerm = linearTermRegex.find(polynomial)?.value
    val constant = constantRegex.find(polynomial)?.value
    var num: String?

    if (polynomial == "0") {
        result = "W"
    } else {
        if (linearTerm != null) {
            num = (linearTerm.substring(0, linearTerm.length - 1).toInt() / 2).toString()
            val sign = if (num[0].isDigit() || num[0] == '+') "" else "-"

            result += if (num == "1" || num == "-1") sign + "xx" else num + "xx"
        }

        if (constant != null) {
            num = constant

            if (num != "+0" && num != "-0") {
                val sign = if (num[0].isDigit() || num[0] == '+') "+" else "-"

                result += when (num) {
                    "1" -> "x"
                    "-1", "+1" -> sign + "x"
                    else -> num + "x"
                }
            }
        }

        result += "+W"
    }

    bw.write(result)
    bw.flush()
    bw.close()
}