import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var input: String?
    while (true) {
        input = readLine()
        if (input == "#") break
        
        bw.appendLine("${input.lowercase(Locale.getDefault()).filter { it in 'a' .. 'z' }.groupingBy { it }.eachCount().size}")
        bw.flush()
    }
    
    bw.close()
}