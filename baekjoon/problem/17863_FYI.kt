import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = readLine()
    var result = false
    if (input.substring(0 .. 2) == "555") result = true
    
    bw.write(if (result) "YES" else "NO")
    bw.flush()
    bw.close()
}