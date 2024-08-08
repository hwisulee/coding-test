import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()
    val requiredChar = "ROYGBIV"
    val check = BooleanArray(2) { true }
    
    for (ch in requiredChar.lowercase()) {
        if (!s.contains(ch)) {
            check[0] = false
            break
        }
    }

    for (ch in requiredChar) {
        if (!s.contains(ch)) {
            check[1] = false
            break
        }
    }
    
    val result = when {
        check[0] && check[1] -> "YeS"
        check[0] -> "yes"
        check[1] -> "YES"
        else -> "NO!"
    }
    
    bw.write(result)
    bw.flush()
    bw.close()
}