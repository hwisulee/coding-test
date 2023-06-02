import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    for (i in 0 until n) {
        val temp = n - 3 * i

        if (temp < 0) {
            bw.write("-1")
            break
        }

        if (temp % 5 == 0) {
            bw.write("${i + temp / 5}")
            break
        }
    }

    bw.flush()
    bw.close()
}