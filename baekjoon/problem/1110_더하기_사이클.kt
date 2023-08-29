import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

var cnt = 0

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    cycle(n, n)

    bw.write("$cnt")
    bw.flush()
    bw.close()
}

fun cycle(n: Int, x: Int) {
    val temp = x.toString().chunked(1)
    val rightNum = temp.last()
    val sumNum = temp.sumOf { it.toInt() }.toString().chunked(1).last()
    val newNum = if (x >= 10) { ("$rightNum$sumNum").toInt() } else ("$rightNum$x").toInt()
    cnt++
    
    if (newNum != n) cycle(n, newNum)
}