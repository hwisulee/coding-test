import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val s = readLine()
    val pi = makeTable(s)

    var pattern = ""
    var len = pi[s.length - 1]
    out@ while (len > 0) {
        for (i in 1 until s.length - 1) {
            if (pi[i] == len) {
                pattern = s.substring(i - len + 1, i + 1)
                break@out
            }
        }

        len = pi[len - 1]
    }

    if (pattern.isEmpty()) bw.write("-1") else bw.write(pattern)
    bw.flush()
    bw.close()
}

fun makeTable(pattern:String):IntArray{
    val patternSize = pattern.length
    val table = IntArray(patternSize)

    var j = 0
    for(i in 1 until patternSize) {
        while(j > 0 && pattern[i]!=pattern[j]) {
            j = table[j - 1]
        }
        if(pattern[i] == pattern[j]) {
            table[i] = ++j
        }
    }

    return table
}