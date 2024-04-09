import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val nameList = MutableList<String>(n) { readLine() }
    
    bw.write(if (nameList.contains("anj")) "뭐야;" else "뭐야?")
    bw.flush()
    bw.close()
}