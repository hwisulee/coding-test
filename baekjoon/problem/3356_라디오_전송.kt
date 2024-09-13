import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val l = readLine().toInt()
    val s = readLine()

    val pi = getPi(s)
    bw.write("${l - pi[pi.lastIndex]}")

    bw.flush()
    bw.close()
}

fun getPi(str: String): IntArray {
    val pi = IntArray(str.length)
    var j = 0

    for(i in 1 until str.length) {
        while(j > 0 && str[i] != str[j]) j = pi[j - 1]
        if(str[i] == str[j]) pi[i] = ++j
    }

    return pi
}