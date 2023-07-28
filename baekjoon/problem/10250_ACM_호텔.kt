import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val (h, w, n) = br.readLine().split(" ").map { it.toInt() }

        if (n % h == 0) bw.appendLine("${h * 100 + (n / h)}")
        else if (n / h + 1 >= 10) bw.appendLine("${n % h}${n / h + 1}")
        else bw.appendLine("${n % h}0${n / h + 1}")

        bw.flush()
    }
    bw.close()
}