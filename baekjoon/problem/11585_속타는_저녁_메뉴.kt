import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val input = readLine().replace(" ", "").repeat(2).dropLast(1)
    val pattern = readLine().replace(" ", "")
    val cnt = kmp(input, pattern)
    val gcd = gcd(cnt, n)

    bw.write("${cnt / gcd}/${n / gcd}")
    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a

fun kmp(str: String, pattern: String): Int {
    val idxArr = IntArray(2)
    val arr = makeTable(pattern)
    var cnt = 0

    for (i in idxArr[0] until str.length) {
        if (str[i] == pattern[idxArr[1]]) {
            if (++idxArr[1] == pattern.length) {
                idxArr[1] = arr[idxArr[1] - 1]
                cnt++
            }
        } else {
            if (idxArr[1] > 0) idxArr[1] = arr[idxArr[1] - 1]
        }

        idxArr[0]++
    }

    return cnt
}

fun makeTable(pattern: String): IntArray {
    val arr = IntArray(pattern.length)
    var idx = 0

    for (i in 1 until arr.size) {
        while (idx > 0 && pattern[i] != pattern[idx]) {
            idx = arr[idx - 1]
        }

        if (pattern[i] == pattern[idx]) arr[i] = ++idx
    }

    return arr
}