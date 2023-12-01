import java.io.BufferedWriter
import java.io.OutputStreamWriter
import kotlin.math.abs

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var result = 0
    val str1 = IntArray(26) { 0 }
    val str2 = IntArray(26) { 0 }
    readLine().forEach { str1[it - 'a']++ }
    readLine().forEach { str2[it - 'a']++ }
    repeat(26) {
        if (str1[it] != str2[it]) result += abs(str1[it] - str2[it])
    }

    bw.write("$result")
    bw.flush()
    bw.close()
}