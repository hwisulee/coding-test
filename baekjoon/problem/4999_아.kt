import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = readLine().count { it == 'a' }
    val b = readLine().count { it == 'a' }

    if (a >= b) bw.write("go") else bw.write("no")
    bw.flush()
    bw.close()
}