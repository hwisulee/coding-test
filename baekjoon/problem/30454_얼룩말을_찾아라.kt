import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val (n, l) = readLine().split(" ").map { it.toInt() }
    val list = List(n) { readLine().replace("0", " ").split(" ").filter { it != "" }.size }
    bw.write("${list.max()} ${list.count { it == list.max() }}")
    bw.flush()
    bw.close()
}