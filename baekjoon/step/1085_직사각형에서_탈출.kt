import java.io.*
import kotlin.math.abs

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (x, y, w, h) = br.readLine().split(" ").map { it.toInt() }
    val list = emptyList<Int>().toMutableList()
    list += abs(w - x)
    list += abs(0 - x)
    list += abs(h - y)
    list += abs(0 - y)

    bw.write("${list.min()}")
    bw.flush()
    bw.close()
}