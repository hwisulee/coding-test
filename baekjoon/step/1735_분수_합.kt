import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (a, b) = br.readLine().split(" ").map { it.toInt() }
    val (x, y) = br.readLine().split(" ").map { it.toInt() }
    val by = b * y / gcd(b, y)
    val child = (a * (by / b)) + (x * (by / y))

    if (gcd(child, by) == 1) bw.write("$child $by")
    else bw.write("${child / gcd(child, by)} ${by / gcd(child, by)}")
    bw.flush()
    bw.close()
}

fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a