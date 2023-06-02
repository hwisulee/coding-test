import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().split(" ").map { it.toInt() }

    for (x in -999 .. 999) {
        for (y in -999 .. 999) {
            if (num[0] * x + num[1] * y == num[2] && num[3] * x + num[4] * y == num[5]) {
                bw.write("$x $y")
                break
            }
        }
    }
    bw.flush()
    bw.close()
}