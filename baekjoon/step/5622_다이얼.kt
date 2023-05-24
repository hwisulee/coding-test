import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val call = br.readLine().chunked(1)
    val numGroup = arrayOf(arrayOf("A", "B", "C"), arrayOf("D", "E", "F"), arrayOf("G", "H", "I"), arrayOf("J", "K", "L"), arrayOf("M", "N", "O"), arrayOf("P", "Q", "R", "S"), arrayOf("T", "U", "V"), arrayOf("W", "X", "Y", "Z"))
    var cnt = 0

    for (i in call.indices) {
        for (j in numGroup.indices) {
            if (numGroup[j].contains(call[i])) cnt += j + 3
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}