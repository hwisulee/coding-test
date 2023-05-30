import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var n = br.readLine().toInt()
    var cnt = 2

    while (n > 1) {
        if (n % cnt == 0) {
            bw.write("$cnt\n")
            n /= cnt
        } else {
            cnt++
        }
    }

    bw.flush()
    bw.close()
}