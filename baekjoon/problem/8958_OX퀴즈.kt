import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val result = br.readLine().chunked(1)
        var score = 0
        var continuity = 0
        for (i in result.indices) {
            if (result[i] == "O") {
                continuity++
                score += continuity
            } else {
                continuity = 0
            }
        }

        bw.appendLine("$score")
    }
    bw.flush()
    bw.close()
}