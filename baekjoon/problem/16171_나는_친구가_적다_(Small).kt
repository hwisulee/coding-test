import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine().replace("[^a-z|A-Z]".toRegex(), "")
    val find = readLine()
    
    bw.write(if (input.contains(find)) "1" else "0")
    bw.flush()
    bw.close()
}