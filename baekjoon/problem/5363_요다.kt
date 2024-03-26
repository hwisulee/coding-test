import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    repeat(n) {
        readLine().split(" ").also {
            bw.append(it.slice(2 .. it.lastIndex).joinToString(" ")).append(" ")
            bw.appendLine(it.slice(0 .. 1).joinToString(" "))
        }
        
        bw.flush()
    }

    bw.close()
}