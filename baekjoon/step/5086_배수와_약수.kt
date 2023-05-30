import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val answer = br.readLine().split(" ").map { it.toInt() }

        if (answer.sum() == 0) break
        if (answer[0] > answer[1]) {
            if (answer[0] % answer[1] == 0) bw.write("multiple\n")
            else bw.write("neither\n")
        } else {
            if (answer[1] % answer[0] == 0) bw.write("factor\n")
            else bw.write("neither\n")
        }
    }
    bw.flush()
    bw.close()
}