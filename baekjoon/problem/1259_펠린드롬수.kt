import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val temp = br.readLine()

        if (temp == "0") break
        else {
            if (temp.reversed() == temp) bw.appendLine("yes")
            else bw.appendLine("no")
        }
    }

    bw.flush()
    bw.close()
}