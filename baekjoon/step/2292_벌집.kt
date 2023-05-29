import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    if (n == 1) {
        bw.write("${1}")
    } else {
        var room = 2
        var num = 1

        while (room <= n) {
            room += 6 * num++
        }

        bw.write("$num")
    }

    bw.flush()
    bw.close()
}