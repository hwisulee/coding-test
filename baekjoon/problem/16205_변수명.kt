import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    readLine().split(" ").also { str ->
        val base = if (str[1].contains("_")) str[1].split("_") else str[1].split("(?=[A-Z])".toRegex())
        base.map { it.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }.also {
            bw.append("${it.joinToString("").replaceFirstChar { it.lowercaseChar() }}\n")
                .append("${it.joinToString("_").lowercase().removePrefix("_")}\n")
                .append(it.joinToString(""))
        }
    }
    bw.flush()
    bw.close()
}