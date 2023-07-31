import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    bw.appendLine("${gcd(a, b)}").appendLine("${a * b / gcd(a, b)}")
    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a