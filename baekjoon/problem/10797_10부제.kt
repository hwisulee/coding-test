import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() = with(System.`in`.bufferedReader()) {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = readLine().toInt()
    val cars = readLine().split(" ").map { it.toInt() }

    bw.write("${cars.count { it == n }}")
    bw.flush()
    bw.close()
}