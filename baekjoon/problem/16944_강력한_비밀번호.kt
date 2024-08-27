import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()

    bw.write("${checkPassword(n, s)}")
    bw.flush()
    bw.close()
}

fun checkPassword(n: Int, s: String): Int {
    var missingTypes = 0
    val lowercaseRegex = "[a-z]".toRegex()
    val uppercaseRegex = "[A-Z]".toRegex()
    val digitRegex = "[0-9]".toRegex()
    val specialCharRegex = "[!@#\$%^&*()\\-+]".toRegex()

    if (!lowercaseRegex.containsMatchIn(s)) missingTypes++
    if (!uppercaseRegex.containsMatchIn(s)) missingTypes++
    if (!digitRegex.containsMatchIn(s)) missingTypes++
    if (!specialCharRegex.containsMatchIn(s)) missingTypes++
    val additionalCharForLength = if (n < 6) 6 - n else 0

    return maxOf(missingTypes, additionalCharForLength)
}