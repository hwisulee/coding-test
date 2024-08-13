import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(readLine().toInt()) {
        val cur = readLine()
        val n = (cur.length + 2) / 3

        val curPrime = cur.substring(0, n)
        val revCurPrime = curPrime.reversed()
        val tailRCP = revCurPrime.drop(1)
        val tailCP = curPrime.drop(1)

        val p1 = curPrime + revCurPrime + curPrime
        val p2 = curPrime + tailRCP + curPrime
        val p3 = curPrime + revCurPrime + tailCP
        val p4 = curPrime + tailRCP + tailCP

        bw.write(if (cur == p1 || cur == p2 || cur == p3 || cur == p4) "1" else "0")
        bw.newLine()
    }
    
    bw.flush()
    bw.close()
}