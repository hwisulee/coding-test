import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("${fibonacci(br.readLine().toInt())}")
    bw.flush()
    bw.close()
}

fun fibonacci(n: Int) = run {
    tailrec fun fibonacciAcc(n: Int, a: Long, b: Long): Long {
        return when (n == 0) {
            true -> b
            false -> fibonacciAcc(n - 1, a + b, a)
        }
    }
    fibonacciAcc(n, 1, 0)
}