import java.io.*
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val temp = br.readLine().split(" ").map { it.toInt() }
        if (temp.sum() <= 0) break
        else {
            if (temp.filter { it != temp.max() }.map { it.toDouble().pow(2).toInt() }.sum() == temp.max().toDouble().pow(2).toInt()) bw.appendLine("right")
            else bw.appendLine("wrong")
        }
    }
    bw.flush()
    bw.close()
}
