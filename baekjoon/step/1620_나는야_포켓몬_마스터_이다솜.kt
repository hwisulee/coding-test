import java.io.*

fun main(args: Array<String>) {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val list = MutableList(n) { "" }
    val check = HashMap<String, Int>()

    repeat(n) {
        val line = br.readLine()
        list[it] = line
        check[line] = it + 1
    }

    repeat(m) {
        val line = br.readLine()
        try {
            val a = line.toInt()
            bw.appendLine(list[a - 1])
        } catch (_: Exception) {
            bw.appendLine("${check[line]}")
        }
    }
    bw.flush()
    bw.close()
}