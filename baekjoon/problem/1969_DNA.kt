import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = readLine().split(" ").map { it.toInt() }
    val dna = Array(n) { readLine() }
    var newDna = ""
    var sum = 0
    for (i in 0 until m) {
        val st = StringBuilder()
        for (j in 0 until n) { st.append("${dna[j][i]}") }
        val key = st.groupingBy { it }.eachCount().maxWith(compareBy<Map.Entry<Char, Int>> { it.value }.thenByDescending { it.key }).key
        sum += st.groupingBy { it }.eachCount().filter { it.key != key }.values.sum()
        newDna += key
    }
    bw.appendLine(newDna).append("$sum")
    bw.flush()
    bw.close()
}