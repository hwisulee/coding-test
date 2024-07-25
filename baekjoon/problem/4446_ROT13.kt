import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val vowels = "aiyeou"
    val consonants = "bkxznhdcwgpvjqtsrlmf"

    while (true) {
        val line = readLine() ?: break
        val result = StringBuilder()

        for (c in line) {
            val (isUpper, lowerChar) = if (c.isUpperCase()) Pair(true, c.lowercaseChar()) else Pair(false, c)
            val newChar = when (lowerChar) {
                in vowels -> {
                    val tempChar = vowels[(vowels.indexOf(lowerChar) + 3) % vowels.length]
                    if (isUpper) tempChar.uppercaseChar() else tempChar
                }
                in consonants -> {
                    val tempChar = consonants[(consonants.indexOf(lowerChar) + 10) % consonants.length]
                    if (isUpper) tempChar.uppercaseChar() else tempChar
                }
                else -> c
            }

            result.append(newChar)
        }

        bw.write(result.toString())
        bw.newLine()
    }

    bw.flush()
    bw.close()
}