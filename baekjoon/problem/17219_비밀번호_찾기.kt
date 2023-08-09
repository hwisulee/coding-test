import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val (n, m) = br.readLine().split(" ").map { it.toInt() }
    val hash = HashMap<String, String>()
    val sb = StringBuilder()
    repeat(n + m) {
        val data = br.readLine()

        when {
            it <= n - 1 -> {
                val (address, password) = data.split(" ")
                hash[address] = password
            }
            else -> {
                sb.appendLine("${hash[data]}")
            }
        }
    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}