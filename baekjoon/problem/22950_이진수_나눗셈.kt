import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val m = readLine().toCharArray().toList()
    val k = readLine().toInt()

    bw.write(if (action(n, m, k)) "YES" else "NO")
    bw.flush()
    bw.close()
}

fun action(n: Int, m: List<Char>, k: Int): Boolean {
    if ('1' !in m) return true
    if (k == 0) return true

    var cnt = 0
    for (i in m.size - 1 downTo 0) {
        if (m[i] == '1') break
        if (m[i] == '0') cnt++
    }

    return cnt >= k
}