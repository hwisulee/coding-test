import java.io.BufferedWriter
import java.io.OutputStreamWriter

data class data(val name: String, val korean: Int, val english: Int, val math: Int)

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val arr = mutableListOf<data>()
    repeat(n) {
        val (name, a, b, c) = readLine().split(" ")
        arr += data(name, a.toInt(), b.toInt(), c.toInt())
    }

    arr.sortedWith(compareBy ({ -it.korean }, { it.english }, { -it.math }, { it.name })).onEach { bw.appendLine(it.name) }
    bw.flush()
    bw.close()
}