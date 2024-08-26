import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val s = readLine()
    
    val charCount = mutableMapOf<Char, Int>().withDefault { 0 }
    
    for (char in s) {
        if (char in "uospc") {
            charCount[char] = charCount.getValue(char) + 1
        }
    }
    
    val minCount = listOf('u', 'o', 's', 'p', 'c').minOf { charCount.getValue(it) }
    
    bw.write("$minCount")
    bw.flush()
    bw.close()
}