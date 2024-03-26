import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val sb = StringBuilder()
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val oriArr = Array(n) { readLine() }
    oriArr.forEachIndexed { index, s ->
        s.forEach { sb.append("$it$it") }
        if (index < oriArr.size - 1) sb.append("\n")
    }
    
    val newArr = Array(n) { readLine() }
    bw.write(if (sb.toString() == newArr.joinToString("\n")) "Eyfa" else "Not Eyfa")
    bw.flush()
    bw.close()
}