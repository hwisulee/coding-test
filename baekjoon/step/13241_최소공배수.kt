import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = br.readLine().split(" ").map { it.toLong() }
    bw.appendLine("${a * b / gcd(a, b).toLong()}")
    bw.flush()
    bw.close()
}

fun gcd(a: Long, b: Long): Number = if (b != 0.toLong()) gcd(b, a % b) else a