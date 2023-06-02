import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    var num = 666
    var cnt = 1
    while (cnt != n) {
        num++

        if (num.toString().contains("666")) {
            cnt++
        }
    }

    bw.write("$num")
    bw.flush()
    bw.close()
}