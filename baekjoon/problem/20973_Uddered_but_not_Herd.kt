import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cowphabet = readLine()
    val heard = readLine()
    
    val posMap = mutableMapOf<Char, Int>()
    for ((i, c) in cowphabet.withIndex()) {
        posMap[c] = i
    }
    
    var cnt = 1
    var curPos = -1
    for (c in heard) {
        val pos = posMap[c]!!
        
        if (pos <= curPos) cnt++
        curPos = pos
    }
    
    bw.write("$cnt")
    bw.flush()
    bw.close()
}