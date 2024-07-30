import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val a = readLine()
    val b = readLine()

    bw.write(if (isDuramuri(a, b)) "YES" else "NO")
    bw.flush()
    bw.close()
}

fun isDuramuri(a: String, b: String): Boolean {
    if (a.first() != b.first() || a.last() != b.last()) return false
    if (!a.toCharArray().sortedArray().contentEquals(b.toCharArray().sortedArray())) return false

    val newA = a.replace("[aeiou]".toRegex(), "")
    val newB = b.replace("[aeiou]".toRegex(), "")

    return newA == newB
}