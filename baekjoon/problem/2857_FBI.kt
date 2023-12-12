import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = arrayListOf<String>()
    repeat(5) { arr += readLine() }

    var idxList = intArrayOf()
    arr.forEachIndexed { index, s -> if (s.contains("FBI")) idxList += index + 1 }

    bw.write(if (idxList.isNotEmpty()) idxList.joinToString(" ") else "HE GOT AWAY!")
    bw.flush()
    bw.close()
}