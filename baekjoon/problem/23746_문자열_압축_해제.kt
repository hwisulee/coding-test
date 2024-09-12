import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val map = mutableMapOf<Char, String>()
    repeat(n) {
        val (pattern, code) = readLine().split(" ")
        map[code.toCharArray()[0]] = pattern
    }
    val zipWord = readLine()
    val (s, e) = readLine().split(" ").map { it.toInt() }

    val sb = StringBuilder()
    zipWord.forEach { sb.append(map[it]) }
    
    bw.write(sb.substring(s - 1 until e))
    bw.flush()
    bw.close()
}