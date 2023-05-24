import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val answer = br.readLine()

        if (answer.isNullOrEmpty() || answer.length > 100) {
            break
        } else {
            bw.write("$answer\n")
        }
    }

    bw.flush()
    bw.close()
}