import java.io.*
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    bw.write("${(2.0.pow(n)).toInt()}")
    bw.flush()
    bw.close()
}