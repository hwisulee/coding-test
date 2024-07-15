import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val k = readLine().chunked(1).map { if (it.toInt() % 2 == 0) 0 else 1 }
    bw.write(if (k.count { it == 0 } > k.count { it == 1 }) "0" else if (k.count { it == 0 } == k.count { it == 1 }) "-1" else "1")
    bw.flush()
    bw.close()
}