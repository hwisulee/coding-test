import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine().toInt()
    repeat(s) {
        val arr = IntArray(2)
        readLine().replace(" ", "").forEach { 
            when (it.lowercaseChar()) {
                'a', 'e', 'i', 'o', 'u' -> arr[1]++
                else -> arr[0]++
            }
        }
        
        bw.appendLine(arr.joinToString(" "))
        bw.flush()
    }
    
    bw.close()
}